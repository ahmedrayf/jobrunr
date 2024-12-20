# Overview
This project demonstrates how to implement dynamic job scheduling using JobRunr with Spring Boot. The system supports executing different types of jobs (REST, gRPC, and internal jobs) based on configurations stored in the database. It also features a clean and scalable architecture to manage and schedule jobs dynamically, making it easy to maintain and extend.

# Features
Dynamic scheduling of jobs based on database entries.
Support for:
- REST API jobs (calls external REST endpoints).
- gRPC jobs (calls methods on remote gRPC servers).
- Internal jobs (executes application-specific logic).
Modular and extensible architecture:
Strategy Pattern for managing internal jobs.
- Dynamic resolution of job handlers via Spring's dependency injection.
H2 in-memory database for demo data.
- Scheduled jobs based on cron expressions.
- Testability with a clean design and preloaded demo data.
## Technologies Used
- Spring Boot (2.7+)
- JobRunr (Job scheduling)
- H2 Database (In-memory database)
- JPA/Hibernate (Database ORM)

## Prerequisites
Before running this application, ensure you have the following installed:
- **Java 17** or later
- **Maven** or **Gradle**

## Setup and Run
### Step 1: Clone the Repository
```bash
git clone https://github.com/ahmedrayf/jobrunr.git
cd jobrunr
```
### Step 2: Build the application
```bash
mvn clean install
```
### Step 3: Run the application
```bash
mvn spring-boot:run
```
### Step 4: Access jobrunr dashboard on
http://localhost:8000/




# Author
## Ahmed Rayef

[Website](https://ahmedrayf.github.io/)

[LinkedIn](https://www.linkedin.com/in/ahmedrayf/)

[Email](ahmedrayf@hotmail.com)




