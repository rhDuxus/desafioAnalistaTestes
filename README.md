# Desafio de Analista de Testes

O objetivo deste teste é avaliar a capacidade do candidato de escrever testes automatizados utilizando Cypress para uma aplicação de login e registro de usuários.

## Instruções

1. A aplicação backend já foi desenvolvida utilizando Spring Boot, portanto não é necessário modificar ou se preocupar com o backend. **O foco do teste será somente nos testes com Cypress**.
2. Para iniciar o backend, é necessário:
    - Ter o [docker](https://docs.docker.com/engine/install/) instalado na máquina.
    - Entrar no diretório raíz da aplicação pelo terminal e executar: `docker-compose up --build`
3. O candidato deverá realizar a configuração inicial do Cypress e escrever os testes automatizados mencionados abaixo.
4. Além dos testes que serão solicitados abaixo, existe muito valor em cenários pensando "fora da caixa" que mostrem problemas nas aplicações. Caso cenários assim sejam encontrados, criar testes dedicados do Cypress em arquivos de spec dedicados comprovando a falha, explicando o cenário em comentários.
5. Comentários sempre são bem-vindos em métodos ou estruturas mais complexas.
6. Importante: Nos envie, ao final, uma descrição com detalhes de como podemos executar os testes implementados por linha de comando.


## Testes Previstos

1. Testar a validação de campos obrigatórios:
    - Testar se a página de registro exibe um erro quando o formulário é enviado sem preencher os campos obrigatórios (e-mail, senha e confirmação de senha), validando a mensagem que é exibida para o usuário.
2. Testar a confirmação de senha:
    - Testar se a página de registro exibe um erro caso as senhas não coincidam ao enviar o formulário, validando a mensagem que é exibida para o usuário.
3. Testar o sucesso no registro de um novo usuário:
    - Testar o fluxo de registro quando o usuário preenche todos os campos corretamente e submete o formulário.
    - Após a criação do usuário, testar se este novo usuário consegue logar com sucesso na aplicação.
4. Testar a validação de e-mail já registrado:
    - Testar se a página de registro exibe um erro caso o e-mail já tenha sido registrado anteriormente.
