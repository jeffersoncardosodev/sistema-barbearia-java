# 💈 Sistema de Barbearia - Java + MySQL

Projeto desenvolvido em Java com o objetivo de praticar conceitos fundamentais de programação backend e integração com banco de dados.

O sistema simula o gerenciamento básico de uma barbearia, permitindo o cadastro e gerenciamento de clientes através de um menu interativo no console.

---

## 🚀 Tecnologias utilizadas

- Java
- MySQL
- JDBC (Java Database Connectivity)
- IntelliJ IDEA
- Git e GitHub

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram aplicados diversos conceitos importantes de programação:

- Programação Orientada a Objetos (POO)
- Estrutura de menus em aplicações de console
- Integração entre Java e banco de dados
- Execução de comandos SQL via JDBC
- Organização do projeto em camadas (Model, DAO e Database)
- Uso de PreparedStatement para execução segura de consultas SQL
- Implementação de operações CRUD

---

## ⚙️ Funcionalidades do sistema

Atualmente o sistema permite:

- Cadastrar clientes
- Listar clientes cadastrados
- Atualizar dados de clientes
- Deletar clientes do sistema

Todas as informações são armazenadas em um banco de dados MySQL.

---

## 🏗 Estrutura do projeto

src
│
├── model
│ ├── Cliente.java
│ ├── Servico.java
│ └── Agendamento.java
│
├── dao
│ └── ClienteDAO.java
│
├── database
│ └── Conexao.java
│
└── Main.java

## 🔜 Melhorias Futuras

- Persistência em banco de dados
- Refatoração para organização em pacotes
- Evolução para API REST com Spring Boot