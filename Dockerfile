# Etapa 1: Build da aplicação usando Maven
FROM maven:3.9-eclipse-temurin-21-alpine AS build

# Definindo o diretório de trabalho
WORKDIR /app

# Copiar o código fonte para o container
COPY . .

# Rodar o comando de build Maven para compilar a aplicação
RUN mvn clean install -DskipTests

# Etapa 2: Imagem para rodar a aplicação com OpenJDK 21
FROM openjdk:21-jdk-slim

# Diretório de trabalho no container
WORKDIR /app

# Copiar o JAR gerado na etapa anterior para o container
COPY --from=build /app/target/*.jar app.jar

# Expor a porta da aplicação (caso queira alterar a porta, altere também em docker-compose.yml)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
