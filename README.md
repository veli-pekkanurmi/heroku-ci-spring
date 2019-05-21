# HEROKU CI project

## Tech stack & implementations
- [x] Docker
- [x] Maven Spotify Docker plugin
- [x] Enviroment Profile variables for builds (default/dev, production)
- [ ] git gated commits - run tests
- [ ] Travis git deploy to Heroku after commits (dev / production)
- [ ] Tests
      - [ ] Unit: JUnit
      - [ ] Integration: JUnit
      - [ ] UI: (Robotframework, Selenium)
      - [ ] Load: Junit
- [ ] Monitoring
      - [ ] Spring Actuator
      - [ ] Jhipster
      - [ ] Log4J

## Commands

###### Build with Maven (generates Docker file) -  images for enviroments
```
mvn package -DskipTests docker:build
mvn package -DskipTests docker:build -Dapp-profile=prod
```
###### Run docker container by image name
```
docker run -d -p 8080:8081 heroku-app-default
docker run -d -p 8080:8081 heroku-app-prod
```
###### push to heroku container hub
```
cd target/docker && heroku container:push web
```
###### deploy to heroku
```
cd target/docker && heroku container:release web
```
###### open app (https://heroku-ci-spring.herokuapp.com/employees)
```
heroku open
```
###### Run spring boot run with profile arguments (novelty)
```
mvn spring-boot:run -Dspring.profiles.active=prod
```
###### Remove old docker images
```
docker rmi $(docker images -qa -f 'dangling=true')
```
###### DEPRECATED docker run with profile argument
###### uses run.sh in Dockerfile CMD & jar. in docker-folder - not a good fit with Heroku CLI deployment
```
docker run -d -p 8080:8081 heroku-app prod
```
###### DEPRECATED create image
```
docker build -t heroku-app:latest .
```
