Spring Cloud Demo
===

- [x] spring-boot
- [x] spring-remoting (Hessian)
- [x] spring-cloud
- [x] spring-cloud-eureka
- [x] spring-cloud-eureka-server

```
cd registration
mvn clean package
java -jar target/registration-0.0.1-SNAPSHOT.jar

cd demo
mvn clean package
java -jar service/target/service-0.0.1-SNAPSHOT.jar
java -jar web/target/web-0.0.1-SNAPSHOT.jar
```

- registration: http://localhost:1111
- service: http://localhost:2222
- web: http://localhost:3333