# JSF CRUD

A simple CRUD app for user management using JSF.

## URL
* http://localhost:8080/jsfcrud/views/users/index.xhtml

## Requirements

* OpenJDK 11
* Payara Server 5.194
* Java DB (embedded)

## Database

```SQL
CREATE TABLE USER (
   ID INT GENERATED ALWAYS AS IDENTITY,
   NAME VARCHAR(255),
   ADDRESS VARCHAR(255),
   CREATEDAT TIMESTAMP NOT NULL,
   UPDATEDAT TIMESTAMP NOT NULL,
   PRIMARY KEY (Id)
);
```
