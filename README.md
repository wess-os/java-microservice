# Java Microservice

## Description
This project is a simple example of microservices using Java, Spring Boot, RabbitMQ, PostgreSQL and Gmail.

## Structure
Client -> POST /users -> USER MICROSERVICE -> BROKER -> EMAIL MICROSERVICE -> EMAIL
                         1. Save user.                  2. Listen message.
                         3. Publish message.            4. Send email.
                                                        5. Save email.

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
