# Colruyt CRM with REST and Spring Boot 3

## Database and connection

To run our PostgreSQL container, you will need an environment file `.env` with the following fields:
```
DATABASE_NAME=[db-name]
DATABASE_PSW=[db-psw]
DATABASE_USER=[db-user]
DATABASE_URL=[jdbc:postgresql://DOMAIN:PORT/DB_NAME]
```

Get the database up and running with a fresh memory
```shell
docker compose up -d
```

Tear down the database and its memory
```shell
docker compose down -v
```

5. Omgevingsvariabelen
   6. IntelliJ
7. Spring Boot config