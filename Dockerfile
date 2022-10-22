FROM openjdk:8
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app.jar"]
#COPY is a docker file command that copies files from a local source location to a destination in the Docker container.
#ADD command is used to copy files/directories into a Docker image
