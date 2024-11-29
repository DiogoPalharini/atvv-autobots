# ATVV Autobots

Este é o projeto **ATVV Autobots**, desenvolvido para gerenciar clientes, funcionários, serviços, mercadorias, vendas e veículos de uma loja de automóveis. A aplicação segue a arquitetura de micro-serviços, com APIs RESTful implementadas usando **Spring Boot**.

## 🎯 Objetivo

O projeto visa fornecer uma solução robusta para o gerenciamento das seguintes funcionalidades:
- Cadastro e gerenciamento de **clientes**.
- Cadastro e gerenciamento de **funcionários**.
- Registro e controle de **serviços e mercadorias**.
- Registro e consulta de **vendas** realizadas.
- Cadastro e controle de **veículos atendidos**.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.0**
  - Spring Web
  - Spring Data JPA
  - Spring Security
- **JWT (JSON Web Token)** para autenticação e autorização.
- **MySQL** como banco de dados relacional.
- **Lombok** para reduzir a verbosidade do código.
- **Maven** como gerenciador de dependências.
- **H2 Database** (opcional, para testes).

## 📂 Estrutura do Projeto

src/main/java/com/example/demo/ ├── controller/ # Controladores REST ├── entity/ # Entidades (modelos de dados) ├── repository/ # Repositórios (acesso ao banco de dados) ├── service/ # Serviços (lógica de negócios) └── DemoApplication.java# Classe principal do projeto

markdown
Copiar código

## 🔧 Configuração e Execução

### Pré-requisitos
- Java 17 ou superior instalado.
- MySQL rodando localmente ou em um servidor.
- Maven instalado.

### Configuração do Banco de Dados

1. Crie um banco de dados no MySQL com o nome desejado:
   ```sql
   CREATE DATABASE atvv_autobots;
   ```
Configure o arquivo src/main/resources/application.properties com as credenciais do seu banco:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/atvv_autobots
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
2. Executar o Projeto
Clone este repositório:

```bash
git clone https://github.com/DiogoPalharini/atvv-autobots.git
cd atvv-autobots
```
Compile o projeto usando Maven:

```bash

mvn clean install
```
3. Execute o projeto:

```bash
mvn spring-boot:run
```

## Testar os Endpoints

Utilize ferramentas como **Postman** ou **Insomnia** para testar as APIs RESTful. As rotas principais estão listadas na seção abaixo.

### 🌐 Endpoints RESTful

#### **Clientes**
- **GET** `/api/clientes` - Lista todos os clientes.
- **GET** `/api/clientes/{id}` - Retorna o cliente pelo ID.
- **POST** `/api/clientes` - Cria um novo cliente.
- **PUT** `/api/clientes/{id}` - Atualiza um cliente.
- **DELETE** `/api/clientes/{id}` - Remove um cliente.

#### **Funcionários**
- **GET** `/api/funcionarios` - Lista todos os funcionários.
- **GET** `/api/funcionarios/{id}` - Retorna o funcionário pelo ID.
- **POST** `/api/funcionarios` - Cria um novo funcionário.
- **PUT** `/api/funcionarios/{id}` - Atualiza um funcionário.
- **DELETE** `/api/funcionarios/{id}` - Remove um funcionário.

#### **Serviços e Mercadorias**
- **GET** `/api/servicos` - Lista todos os serviços/mercadorias.
- **GET** `/api/servicos/{id}` - Retorna um serviço/mercadoria pelo ID.
- **POST** `/api/servicos` - Cria um novo serviço/mercadoria.
- **PUT** `/api/servicos/{id}` - Atualiza um serviço/mercadoria.
- **DELETE** `/api/servicos/{id}` - Remove um serviço/mercadoria.

#### **Vendas**
- **GET** `/api/vendas` - Lista todas as vendas.
- **GET** `/api/vendas/{id}` - Retorna uma venda pelo ID.
- **GET** `/api/vendas/periodo?inicio={inicio}&fim={fim}` - Lista vendas em um período.
- **POST** `/api/vendas` - Cria uma nova venda.
- **PUT** `/api/vendas/{id}` - Atualiza uma venda.
- **DELETE** `/api/vendas/{id}` - Remove uma venda.

#### **Veículos**
- **GET** `/api/veiculos` - Lista todos os veículos.
- **GET** `/api/veiculos/{id}` - Retorna um veículo pelo ID.
- **GET** `/api/veiculos/cliente/{clienteId}` - Lista veículos de um cliente.
- **POST** `/api/veiculos` - Cria um novo veículo.
- **PUT** `/api/veiculos/{id}` - Atualiza um veículo.
- **DELETE** `/api/veiculos/{id}` - Remove um veículo.

### 🔒 Segurança

O sistema utiliza **JWT (JSON Web Token)** para autenticação e autorização. Para acessar as APIs protegidas:
1. Autentique-se usando o endpoint `/auth/login`.
2. Inclua o token JWT no cabeçalho de todas as requisições:
```bash
Authorization: Bearer {seu_token_jwt}
```
