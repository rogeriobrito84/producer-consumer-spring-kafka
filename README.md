
<div style="display: flex; min-width: 100%; justify-content: center; align-items: center; align-content: center;">
    <img src="https://cdn-images-1.medium.com/max/800/1*gxXLMIuJDHCH7fwIgEP1cg.png" width="300px" alt="Spring Boot"/>
    <img src="https://miro.medium.com/max/1200/1*0R28KyrP_IYMdYre7yuJ2g.png" height="300px" alt="Apach Kafka"/>
</div>



# Project Producer and Consumer Kafka

### Drescription
Project for studies kafka

## Run project

### Required:
 * Java
 * Docker instaled

### kafka
For kafka the code below should run
```node
 docker-compose up
```
### Producer
Access the producer folder and execute the code below
```node
mvn install
```
After this, go to folder "target" and execute the command below
```node
java -jar producer-0.0.1-SNAPSHOT.jar 
```
> Your can access swagger ui in the address: http://localhost:8080/swagger-ui/

### Consumer
Access the consumer folder and execute the code below
```node
mvn install
```
After this, go to to folder "target" and execute the command below
```node
java -jar consumer-0.0.1-SNAPSHOT.jar
```
> ready now is just use the end-enpoint "Cars" of Producer
