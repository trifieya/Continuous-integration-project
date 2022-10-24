FROM openjdk:8
ARG JAR_FILE=target/*.jar
RUN apk --no-cache add curl
RUN curl -u admin:nexus -o achat-1.1.jar "http://192.168.162.222:8081/repository/maven-releases/tn/esprit/rh/achat/1.1/achat-1.1.jar" -L
ENTRYPOINT ["java","-jar","/achat-1.1.jar"]
EXPOSE 8089

#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#COPY is a docker file command that copies files from a local source location to a destination in the Docker container.
#ADD command is used to copy files/directories into a Docker image
