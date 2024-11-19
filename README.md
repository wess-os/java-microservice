# Java Microservice

## Description
This project is a simple example of microservices using Java, Spring Boot, RabbitMQ, PostgreSQL and Gmail.

## Communication
```
── Client ->
   ├── USER MICROSERVICE ->
   │   ├── 1. Save user
   │   └── 3. Publish message
   ├── BROKER ->
   ├── EMAIL MICROSERVICE ->
   │   ├── 2. Listen message
   │   ├── 4. Send email
   │   └── 5. Save email
   └── EMAIL
```

## Technologies
- Java;
- Maven;
- Spring:
    - Spring Boot;
    - Spring Web;
    - Spring Data JPA;
    - Spring Validation;
    - Spring AMQP;
    - Spring Mail;
- PostgreSQL;
- RabbitMQ;
- Cloud AMQP;
- SMTP Gmail;
