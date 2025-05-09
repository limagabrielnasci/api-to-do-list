<h1 align="center">
  TODO List
</h1>

API to manage tasks (CRUD) as part of [this challenge](https://github.com/simplify-liferay/desafio-junior-backend-simplify) for junior backend developers applying to Simplify.

The project was built in [this video](https://youtu.be/IjProDV001o).

## Technologies
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [MySQL](https://dev.mysql.com/downloads/)

## Adopted Practices

- SOLID, DRY, YAGNI, KISS
- RESTful API
- Queries using Spring Data JPA
- Dependency Injection
- Error response handling
- Automatic Swagger generation with OpenAPI 3

## How to run

- Clone the Git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

API available at [localhost:8080](http://localhost:8080).
Swagger UI at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Requests made using [httpie](https://httpie.io):

- Create Task 
```
$ http POST :8080/todos name="Todo 1" description="Desc Todo 1" priority=1

[
  {
    "description": "Desc Todo 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }
]
```

- List Tasks
```
$ http GET :8080/todos

[
  {
    "description": "Desc Todo 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }
]
```

- Update Task
```
$ http PUT :8080/todos/1 name="Todo 1 Up" description="Desc Todo 1 Up" priority=2

[
  {
    "description": "Desc Todo 1 Up",
    "id": 1,
    "name": "Todo 1 Up",
    "priority": 2,
    "completed": false
  }
]
```

- Delete Task
```
http DELETE :8080/todos/1

[ ]
```