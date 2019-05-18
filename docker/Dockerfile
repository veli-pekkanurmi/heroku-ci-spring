#FROM java:8
FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash
#WORKDIR /
COPY spring-boot-app-0.0.1-SNAPSHOT.jar /app.jar
COPY run.sh /run.sh
RUN chmod +x run.sh
EXPOSE 8080
ENTRYPOINT ["/run.sh"]
#ENTRYPOINT [ "java", "-jar", "app.jar"]
