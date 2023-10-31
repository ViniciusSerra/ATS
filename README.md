# ATS
Este projeto foi criado para gerenciar operações relacionadas a uma instituição escolar. Ele utiliza o framework Spring Boot, o Spring Data JPA e o banco de dados MySQL para desenvolvimento local.

## Pré-requisitos

- Java 17 ou superior
- Maven
- IDE de sua preferência (IntelliJ IDEA, Eclipse, etc.)

## Configuração e Execução

1. Clone este repositório:
git clone https://github.com/seu_usuario/gestao-escolar.git



2. Navegue até a pasta do projeto:
cd gestao-escolar



3. Execute o projeto utilizando Maven:
mvn spring-boot:run



Isso iniciará o servidor na porta `8080` e você poderá acessar a aplicação em `http://localhost:8080`.

## Funcionalidades

- **Cadastro de Alunos**: Adicione, edite e remova alunos.
- **Cadastro de Professores**: Gerencie os professores da instituição.
- **Disciplinas e Turmas**: Associe disciplinas a turmas e atribua professores.
- **Boletins e Notas**: Registre e consulte o desempenho dos alunos.

## API Endpoints

- `POST /alunos`: Cadastra um novo aluno.
- `GET /alunos`: Lista todos os alunos.
... (e outros endpoints relevantes)
