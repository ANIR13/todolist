# Todo List REST API

A RESTful API built with Spring Boot and MongoDB for managing todo items.

## Features

- Create, Read, Update and Delete todo items
- Mark todos as completed
- Priority levels (LOW, MEDIUM, HIGH)
- Filter todos by completion status
- Filter todos by priority level
- Timestamp tracking (created/updated dates)

## Technologies

- Java 21
- Spring Boot 3.3.6
- Spring Data MongoDB
- Maven
- MongoDB
- Lombok
- JUnit/Spring Boot Test

## Prerequisites

- JDK 21
- MongoDB running on localhost:27017
- Maven 3.x

## Getting Started

1. Clone the repository:
```bash
git clone <repository-url>
```

Here's a comprehensive README.md file for this Spring Boot Todo List API project:


# Todo List REST API

A RESTful API built with Spring Boot and MongoDB for managing todo items.

## Features

- Create, Read, Update and Delete todo items
- Mark todos as completed
- Priority levels (LOW, MEDIUM, HIGH)
- Filter todos by completion status
- Filter todos by priority level
- Timestamp tracking (created/updated dates)

## Technologies

- Java 21
- Spring Boot 3.3.6
- Spring Data MongoDB
- Maven
- MongoDB
- Lombok
- JUnit/Spring Boot Test

## Prerequisites

- JDK 21
- MongoDB running on localhost:27017
- Maven 3.x

## Getting Started

1. Clone the repository:
```bash
git clone <repository-url>
```

2. Configure MongoDB:
- Make sure MongoDB is running on localhost:27017
- The application will create a database named `tododb`

3. Build the project:
```bash
./mvnw clean install
```

4. Run the application:
```bash
./mvnw spring-boot:run
```

The API will be available at 

http://localhost:8080



## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/api/todos` | Get all todos |
| GET | `/api/todos/completed` | Get completed todos |
| GET | `/api/todos/priority/{priority}` | Get todos by priority (LOW/MEDIUM/HIGH) |
| POST | `/api/todos` | Create a new todo |
| PUT | `/api/todos/{id}` | Update a todo |
| DELETE | `/api/todos/{id}` | Delete a todo |

### Request Body Example (Create/Update)

```json
{
    "title": "Sample Todo",
    "description": "This is a sample todo item",
    "completed": false,
    "priority": "LOW"
}
```

### Todo Object Structure

```json
{
    "id": "string",
    "title": "string",
    "description": "string",
    "completed": boolean,
    "priority": "LOW|MEDIUM|HIGH",
    "createdAt": "datetime",
    "updatedAt": "datetime"
}
```

## Testing

Run the tests using:

```bash
./mvnw test
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/anirtech/todolist/
│   │       ├── controller/
│   │       │   └── TodoController.java
│   │       ├── model/
│   │       │   └── Todo.java
│   │       ├── repository/
│   │       │   └── TodoRepository.java
│   │       ├── service/
│   │       │   └── TodoService.java
│   │       └── TodolistApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/anirtech/todolist/
            └── TodolistApplicationTests.java
```

## Contributing

1. Fork the repository
2. Create this feature branch (`git checkout -b feature/amazing-feature`)
3. Commit this changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is open-sourced software.

## Postman Collection

A Postman collection is included in the repository at `src/main/resources/Postman Collections/TODO list app.postman_collection.json` for testing the API endpoints.
```
