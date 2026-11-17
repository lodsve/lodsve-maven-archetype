# ${artifactId}

This project demonstrates Spring Data MongoDB repositories and routing between the default MongoDB connection and a named `archive` data source.

## Run

Set the MongoDB URIs in `src/main/resources/application.yml` if the databases are not available at `localhost:27017`, then start the application:

```shell
./mvnw spring-boot:run
```

The default data source endpoints are `POST /demo/save`, `GET /demo/{id}`, and `GET /demo`. The archive data source endpoints are `POST /demo/archive/save`, `GET /demo/archive/{id}`, and `GET /demo/archive/list`. Prefix these paths with the configured context path when it is not `/`.

Example request body:

```json
{
  "name": "Alice",
  "age": 30
}
```
