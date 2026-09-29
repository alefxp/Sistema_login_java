# Sistema_login_java
Aqui meu primeiro sistema de login, ainda cru porem feito com muito esforço.

- O que o projeto faz

Um sistema simples de autenticação via terminal, com:

Cadastro de usuário (nome, e-mail e senha)
Validação de e-mail duplicado no cadastro
Login com verificação de e-mail e senha
Menu interativo no console (Cadastrar / Login / Sair)

Tecnologias
Java puro (sem frameworks)
Scanner para entrada de dados via terminal
ArrayList para armazenar os usuários em memória

Estrutura do projeto
O código está organizado em camadas:

User — representa um usuário do sistema (nome, e-mail, senha e verificação de senha)
UserRepository — guarda a lista de usuários e faz as buscas (por e-mail, verificação de duplicidade)
AuthService — contém a lógica de negócio: registrar um novo usuário e autenticar um login
LoginMain — ponto de entrada do programa, com o menu via Scanner

Como rodar
Clonar o repositório
Abrir o projeto no IntelliJ (ou outra IDE de sua preferência)
Rodar a classe LoginMain

Usar o menu no console:
1 para cadastrar um novo usuário
2 para fazer login
3 para sair

O que ficou de fora (por enquanto)4
Persistência em banco de dados (os usuários existem só durante a execução)
Criptografia de senha
Frameworks web (Spring, etc.)
Persistência em banco de dados (os usuários existem só durante a execução)
Criptografia de senha
Frameworks web (Spring, etc.)
