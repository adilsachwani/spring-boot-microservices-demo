# Spring Boot Microservices Demo

<b>Eureka Server Configuration</b></br>
1. Adding Spring Cloud Eureka Server Starter Depedency</br>
https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-server
2. Add @EnableEurekaServer annotation
3. Add following properties to application.properties so that Eureka Server doesn't register to itself
```
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```