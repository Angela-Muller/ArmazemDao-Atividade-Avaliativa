# ArmazemDao
## Trabalho Avaliativo  - DAO + JDBC

Este projeto foi desenvolvido para demonstrar o conhecimento adquirido sobre **arquitetura em camadas** utilizando **Java** e **MySQL**, aplicando o padrão **DAO (Data Access Object)**.

O sistema permite cadastrar produtos e listar os produtos armazenando em um banco de dados.

---

## Objetivos do Projeto

- Separar responsabilidades no código
- Demonstrar a comunicação entre Java e Banco de Dados
- Aplicar boas práticas como:
- DAO
- Model
- Factory de conexão
- Evitar SQL Injection
- Facilitar a manutenção e evolução do sistema
---

## Estrutura do Projeto

<img width="300" height="177" alt="image" src="https://github.com/user-attachments/assets/2fa785c1-feef-4573-893c-0dfb5abd0542" />

---

## Descrição das camadas 🖥️

- Main (app)

  - Responsável por:

  - Interagir com o usuários via console

  - Receber dados

  - Chamar o DAO para salvar e listar produtos

  - Não contém SQL, apenas regras de fluxo de aplicação

- Armazem (Model)

  - Representa a tabela produtos do banco de dados.

   Contém:

  - Atributos (id, nome, setor, preco)

  - Construtores

  - Getters e Setters
 
- ArmazemDAO (dao)

   Responsável por:

  - Executar comandos SQL

  - Fazer operações CRUD

  - Converter dados do banco em objetos Java

  - Métodos:

  - cadastrar(Armazem armazem)

  - listar()

  - Centraliza toda a lógica de acesso ao banco.

- ConnectionFactory (config)

   Responsável por:

  - Criar e fornecer conexões com o banco de dados

  - Centralizar URL, usuário e senha

  - Facilita manutenção e evita repetição de código.

## Importância do Padrão DAO

O padrão DAO (Data Access Object) é importante porque:

  - Separa regras de negócio do acesso ao banco

  - Facilita testes

  - Permite trocar o banco sem alterar o restante do sistema
