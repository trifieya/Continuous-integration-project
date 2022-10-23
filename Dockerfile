FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
RUN apk --no-cache add curl
RUN curl -u admin:admin -o achat-1.9.0.jar "http://192.168.162.222:8081/repository/maven-releases/tn/esprit/rh/achat/1.9.0/achat-1.9.0.jar" -L
ENTRYPOINT ["java","-jar","/achat-1.9.0.jar"]
EXPOSE 8089