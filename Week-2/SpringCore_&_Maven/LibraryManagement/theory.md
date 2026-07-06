# Week 2 – Spring Core & Maven

## Exercise 1: Configuring a Basic Spring Application

Objective:
To create a basic Spring application using the Spring IoC Container.

Implementation:
- Created a Maven project.
- Configured Spring using `applicationContext.xml`.
- Defined Spring beans in the XML configuration file.
- Loaded the Spring container using `ClassPathXmlApplicationContext`.

Outcome:
Successfully created and executed a basic Spring application.

---

## Exercise 2: Implementing Dependency Injection

Objective:
To understand Dependency Injection using Spring.

Implementation:
- Created `BookRepository` and `BookService` classes.
- Injected the `BookRepository` object into `BookService`.
- Retrieved the bean from the Spring container instead of creating objects manually.

Outcome:
Successfully implemented Dependency Injection using Spring.

---

## Exercise 4: Creating and Configuring a Maven Project

Objective:
To create and configure a Maven project.

Implementation:
- Created a Maven project named `LibraryManagement`.
- Configured the `pom.xml` file.
- Added Spring dependencies.
- Configured Java 17 in Maven.

Outcome:
Successfully built the project using Maven.

---

## Exercise 5: Configuring the Spring IoC Container

Objective:
To configure and use the Spring IoC Container.

Implementation:
- Created `applicationContext.xml`.
- Configured `BookRepository` and `BookService` as Spring beans.
- Loaded the IoC container using `ClassPathXmlApplicationContext`.

Outcome:
Successfully managed bean creation using the Spring IoC Container.

---

## Exercise 7: Implementing Constructor and Setter Injection

Objective:
To implement Constructor Injection and Setter Injection.

Implementation:
- Implemented Setter Injection using `<property>` in XML.
- Implemented Constructor Injection using `<constructor-arg>` in XML.
- Verified both implementations by running the application.

Outcome:
Successfully implemented both Constructor and Setter Injection.

---

## Exercise 9: Creating a Spring Boot Application

Objective:
To create a basic Spring Boot project.

Implementation:
- Created a Spring Boot Maven project (`orm-learn`) using Spring Initializr.
- Selected Spring Boot, Spring Web, Spring Data JPA, and H2 Database dependencies.
- Generated the project structure for further Spring Data JPA exercises.

Outcome:
Successfully created a Spring Boot application.

---
