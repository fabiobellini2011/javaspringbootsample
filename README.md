# 🚀 Java Spring Boot Sample API

Um projeto **simples e didático** de API REST usando **Java 17** e **Spring Boot 3**, ideal como **base de estudo**, **referência** ou **template inicial** para novos projetos.

Este repositório demonstra:
- Estrutura básica de um projeto Spring Boot
- Criação de API REST
- Persistência com JPA
- Documentação automática com Swagger (OpenAPI)

---

## 🧱 Tecnologias utilizadas

- **Java 17 (LTS)**
- **Spring Boot 3.x**
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Lombok
- Swagger / OpenAPI (Springdoc)
- Maven

---

## 📁 Estrutura do projeto

```
src/main/java/com/applicati/sampleapplication
├── SampleApplication.java
├── controller
│   └── UserController.java
├── service
│   └── UserService.java
├── repository
│   └── UserRepository.java
└── domain
    └── User.java
```

**Responsabilidades:**

- `controller` → Camada REST (endpoints HTTP)
- `service` → Regras de negócio
- `repository` → Acesso a dados (JPA)
- `domain` → Entidades do sistema

---

## ⚙️ Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- **Java 17+**
- **Maven 3.8+**

Verifique:
```bash
java -version
mvn -version
```

---

## ▶️ Como executar o projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/fabiobellini2011/javaspringbootsample.git
cd javaspringbootsample
```

### 2️⃣ Executar com Maven

```bash
mvn spring-boot:run
```

A aplicação iniciará em:

```
http://localhost:8080
```

---

## 📌 Endpoints disponíveis

| Método | Endpoint | Descrição |
|------|---------|----------|
| POST | `/api/users` | Criar um usuário |
| GET | `/api/users` | Listar usuários |
| GET | `/api/users/{id}` | Buscar usuário por ID |
| DELETE | `/api/users/{id}` | Remover usuário |

---

## 📦 Exemplo de requisições

### Criar usuário

```bash
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{
  "name": "Fabio",
  "email": "fabio@email.com"
}'
```

### Listar usuários

```bash
curl http://localhost:8080/api/users
```

---

## 📚 Swagger / OpenAPI

A documentação da API é gerada automaticamente.

### 🔹 Swagger UI
```
http://localhost:8080/swagger-ui/index.html
```

### 🔹 OpenAPI JSON
```
http://localhost:8080/v3/api-docs
```

---

## 🗄️ Banco de dados (H2)

Este projeto usa **H2 em memória**, ideal para testes e aprendizado.

### 🔹 Console H2
```
http://localhost:8080/h2-console
```

**Configuração padrão:**
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: *(em branco)*

---

## 📄 Licença

MIT License

---

## 👤 Autor

**Fabio Bellini**
