# Spring Data JPA – Quick Example

## Objective

The objective of this exercise is to understand the basics of Spring Data JPA by creating a simple Spring Boot application that connects to an H2 in-memory database. The application demonstrates how to use JPA entities, repositories, and services to perform database operations without writing SQL queries manually.

---

## Exercise Description

In this exercise:

- A Spring Boot project was created using Maven.
- Spring Data JPA dependencies were added.
- An H2 in-memory database was configured.
- A `Country` entity was created and mapped to the database.
- A `CountryRepository` interface was created by extending `JpaRepository`.
- A `CountryService` class was implemented to perform database operations.
- Sample country records were inserted into the database using a `DataLoader`.
- The application successfully retrieved and displayed all country records.

---

## Output Description

### Output 1 (`output1.png`)

This screenshot shows the successful execution of the Spring Boot application. It confirms that the application started correctly, connected to the H2 database, created the required table, inserted the sample country records, and displayed all the countries stored in the database.

### Output 2 (`output2.png`)

This screenshot shows the final console output after the application execution. It verifies that the sample data was successfully retrieved from the database using Spring Data JPA repository methods and displayed through the service layer.

---

# Difference between JPA, Hibernate and Spring Data JPA

## JPA (Java Persistence API)

- JPA is a Java specification for Object Relational Mapping (ORM).
- It defines standard interfaces for interacting with relational databases.
- JPA itself does not provide an implementation.

## Hibernate

- Hibernate is one of the most widely used implementations of JPA.
- It maps Java objects to database tables automatically.
- It provides advanced features such as HQL, caching, lazy loading, and automatic schema generation.

## Spring Data JPA

- Spring Data JPA is a Spring Framework module built on top of JPA.
- It simplifies database operations by providing ready-made repository interfaces.
- Developers can perform CRUD operations without writing most of the SQL or boilerplate code.

---

# Summary 

JPA is a specification that defines how Java applications should interact with relational databases. Hibernate is an implementation of the JPA specification and provides the actual ORM functionality. Spring Data JPA is built on top of JPA and Hibernate, making database access much simpler by reducing boilerplate code and providing repository interfaces for common database operations. 