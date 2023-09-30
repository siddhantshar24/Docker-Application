FROM openjdk:17

COPY target/docker_app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","docker_app.jar"]