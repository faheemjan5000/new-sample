FROM openjdk:11
EXPOSE 8080
ADD target/sample-service.jar sample-service.jar
ENTRYPOINT ["java","-jar","/sample-service.jar"]