# Spring Boot Microservices Demo

<b>Eureka Server Configuration</b></br>
https://www.youtube.com/watch?v=GTM2J0nYmbs&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas&index=19
1. Adding Spring Cloud Eureka Server Starter Depedency</br>
https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-server
2. Add @EnableEurekaServer annotation
3. Add following properties to application.properties so that Eureka Server doesn't register to itself
```
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```


<b>Eureka Client Configuration</b></br>
https://www.youtube.com/watch?v=jhvJg4tDrpw&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas&index=20
1. Adding Spring Cloud Eureka Server Client Depedency</br>
https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client
2. Add @EnableEurekaClient annotation
3. Add following property to application.properties to assign a name to the microservice
```
spring.application.name=demo-microservice
```
