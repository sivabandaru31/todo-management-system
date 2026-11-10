# Todo Management System

A Todo Management System developed using **Java and Spring Boot** that allows users to manage their daily tasks through RESTful APIs.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- ModelMapper
- REST APIs
- Postman

## ✨ Features

- Create a new Todo
- Retrieve all Todos
- Retrieve Todo by ID
- Update existing Todo
- Delete Todo
- Manage task completion status
- Entity and DTO mapping using ModelMapper
- Database integration using MySQL

## 🏗️ Project Architecture

```text
todo-management-system
│
├── src/main/java
│   └── com.siva.todo_management
│       ├── controller
│       ├── dto
│       ├── entity
│       ├── exception
│       ├── repository
│       ├── service
│       │   └── impl
│       └── TodoManagementApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
```

## ⚙️ Configuration

Configure your MySQL database in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/sivabandaru31/todo-management-system.git
```

2. Open the project in IntelliJ IDEA.

3. Configure your MySQL database.

4. Update database credentials in `application.properties`.

5. Run the Spring Boot application.

## 🔗 API Operations

| Method | Operation |
|---|---|
| POST | Create Todo |
| GET | Get All Todos |
| GET | Get Todo By ID |
| PUT | Update Todo |
| DELETE | Delete Todo |

## 👨‍💻 Author

**Siva Bandaru**

GitHub: https://github.com/sivabandaru31

---

⭐ If you find this project useful, consider giving it a star!
