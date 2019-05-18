#FROM java:8
FROM openjdk:8-jre-alpine
WORKDIR /
ADD spring-boot-app-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar"]
