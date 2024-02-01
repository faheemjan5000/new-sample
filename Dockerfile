FROM openjdk:11
EXPOSE 8080
ADD target/sample-docker.jar sample-docker.jar
ENTRYPOINT ["java","-jar","/sample-docker.jar"]