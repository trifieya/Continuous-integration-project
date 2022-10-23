FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD settings.xml ~/.m2/settings.xml
ENTRYPOINT ["java","-jar","/achat-1.0.jar"]