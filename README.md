# Desafio de Analista de Testes

Avaliar a capacidade do candidato de escrever testes automatizados utilizando Cypress para uma aplicação de registro e login de usuários.

## Instruções

1. A aplicação backend já foi desenvolvido utilizando Spring Boot, portanto não é necessário modificar o backend. **O foco do teste será somente nos testes com Cypress**. Para iniciar o backend, é necessário:
    - Ter o [docker](https://docs.docker.com/engine/install/) instalado na máquina.
    - Entrar no diretório raíz da aplicação e executar: `docker-compose up --build`
2. O candidato deverá realizar a configuração inicial do Cypress, escrever os testes automatizados.
3. Imagine que estes testes executarão posteriormente servidores linux, dentro de pipelines de CI/CD. Portanto, o candidato deverá fornecer as instruções de como executar estes testes do Cypress por linha de comando.
4. Comentários de código para explicar tomadas de decisão ou estruturas um pouco mais complexas(caso existam) são bem-vindos.
5. Além dos testes que serão solicitados abaixo, existe muito valor em cenários pensando "fora da caixa" que mostrem problemas nas aplicações. Caso cenários assim sejam encontrados, criar testes dedicados do Cypress em arquivos de spec dedicados comprovando a falha, explicando o cenário em comentários.


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
