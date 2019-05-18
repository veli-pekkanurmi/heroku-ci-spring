HEROKU CI test project

# buzz
build with Docker
gated commits - run tests
profile variables
deploy to Heroku after commits- staging / production


# create image
docker build -t heroku-app:latest .

# run with profile argument
docker run -d -p 8080:8081 veli-pekkanurmi/heroku-app:0.0.1 dev
docker run -d -p 8080:8081 heroku-app dev

#base-url
springbootapp/employees


#sources
https://stackify.com/guide-docker-java/
