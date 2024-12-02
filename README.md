# Colruyt CRM with REST and Spring Boot 3

## Database and connection

To run our PostgreSQL container, you will need an environment file `.env` at the root of the project, with the following fields:
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

To Run Spring boot, create a run configuration in IntelliJ.
![Screenshot 2024-12-02 at 11.11.01.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2F0d%2Fhf5xr8996tg_5vzm7jc17xkw0000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_6cxzsP%2FScreenshot%202024-12-02%20at%2011.11.01.png)

And add the environment variables to this configuration.
You can copy them from the `.env` file and past them in the configuration.