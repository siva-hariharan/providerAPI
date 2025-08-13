# Provider API

Provider API is a simple Spring Boot application that exposes provider information via a REST endpoint.

## Requirements
- Java 17
- Maven 3.8+

## Building
```
mvn clean package
```

## Running
Use Spring Boot to run the application:
```
mvn spring-boot:run
```
The service starts on `http://localhost:8080`.

### Endpoint
- `GET /getProviderInfo` – returns a JSON array containing ten providers, each with an ID, name, and address.

## Testing
Run unit tests with Maven:
```
mvn test
```
