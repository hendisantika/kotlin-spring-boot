# Kotlin Spring Boot

Run this project by this command :

`mvn clean spring-boot:run`

```bash
curl http://localhost:8080/
```

```bash
curl -H "Content-Type: application/json" -X POST -d '{
    "firstName": "Hendi",
    "lastName": "Santika"
}'  http://localhost:8080/
```


```bash
curl -X DELETE http://localhost:8080/1
```

```bash
curl -H "Content-Type: application/json" -X PUT -d '{
    "id": 6,
    "firstName": "Hendi",
    "lastName": "Santika"
}'  http://localhost:8080/6
```

```bash
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/sign-up
```

```bash
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/login
```
