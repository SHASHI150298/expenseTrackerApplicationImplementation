## expenseTrackerApplicationImplementation
# README

### REST API for tracking expenses.

A RESTful API created using Spring Boot. We have used MySQL as the relational database and JdbcTemplate to interact with that. Apart from this, we have used JSON Web Token (JWT) to add authentication. Using JWT, we can protect certain endpoints and ensure that user must be logged-in to access those.


### Setup and Installation
Clone the repo from GitHub
```
git clone https://github.com/SHASHI150298/expenseTrackerApplicationImplementation.git
```
cd expense-tracker-api

```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/expense
spring.datasource.username = root
spring.datasource.password = Shashi@15*
spring.datasource.platform=mysql
spring.jpa.hibernate.ddl-auto=create
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
hibernate.dialect.storage_engine=innodb
spring.jpa.database-platform: org.hibernate.dialect.MySQL5InnoDBDialectserver.port=9090
```
#### Run the spring boot application

```
./mvnw spring-boot:run
```
#### this runs at port 9090 and hence all enpoints can be accessed starting from http://localhost:9090
