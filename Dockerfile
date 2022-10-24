FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
RUN apk --no-cache add curl
RUN curl -u admin:admin -o achat-1.6.jar "http://http://192.168.1.124:8081/repository/maven-releases/tn/esprit/rh/achat/1.6/achat-1.6.jar" -L
ENTRYPOINT ["java","-jar","/achat-1.6.jar"]
EXPOSE 8089

#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#COPY is a docker file command that copies files from a local source location to a destination in the Docker container.
#ADD command is used to copy files/directories into a Docker image
