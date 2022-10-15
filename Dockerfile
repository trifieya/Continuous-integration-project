FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD tn/esprit/rh/achat/1.0/achat-1.0.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","/achat-1.0.jar"]
