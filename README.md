# 💈 Sistema de Barbearia - Java

Projeto desenvolvido para praticar Programação Orientada a Objetos (POO) em Java.

O sistema funciona via console e permite o gerenciamento básico de uma barbearia, incluindo cadastro de clientes, serviços e agendamentos.

---

## 🚀 Funcionalidades

✔ Cadastro de clientes  
✔ Listagem de clientes  
✔ Busca de cliente por nome  
✔ Cadastro de serviços  
✔ Listagem de serviços  
✔ Criação de agendamentos  
✔ Listagem de agendamentos

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Composição entre classes
- Uso de ArrayList
- Estruturas de repetição
- Estruturas condicionais
- Controle de fluxo com menu interativo
- Tratamento básico de entrada com Scanner

---

## 🏗 Estrutura do Projeto

- `model.Cliente.java`
- `model.Servico.java`
- `model.Agendamento.java`
- `Main.java`

O sistema utiliza relacionamento entre objetos:

- Um **model.Agendamento** possui um **model.Cliente**
- Um **model.Agendamento** possui um **Serviço**

---

## 📌 Como executar

1. Compilar os arquivos:
```
javac *.java
```

2. Executar o sistema:
```
java Main
```

---

## 🎯 Objetivo do Projeto

Praticar lógica de programação e estruturação de um sistema simples utilizando Java puro, simulando um cenário real de negócio.

---

## 🔜 Melhorias Futuras

- Adicionar validação de entradas inválidas
- Adicionar data no agendamento
- Persistência em banco de dados
- Refatoração para organização em pacotes
- Evolução para API REST com Spring Boot