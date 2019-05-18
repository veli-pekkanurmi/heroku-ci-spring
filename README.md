HEROKU CI test project

build with Docker
Gated commits - run tests
Deploy to Heroku after commits- staging / production

docker run -d -p 8080:8081 heroku-app:latest
java -Dspring.profiles.active=dev -jar docker/spring-boot-app-0.0.1-SNAPSHOT.jar

Base url
springbootapp/employees
