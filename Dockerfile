FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD settings.xml ~/.m2/settings.xml
RUN mvn -s settings.xml clean install