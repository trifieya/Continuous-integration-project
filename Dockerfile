FROM openjdk:8-jdk-alpine
EXPOSE 8089
RUN curl -u admin:admin -o achat-1.8.0.jar "http://192.168.162.222:8081/repository/maven-releases/tn/esprit/rh/achat/1.8.0/achat-1.8.0.jar" -L
ADD achat-1.8.0.jar achat-1.8.0.jar
ENTRYPOINT ["java","-jar","/achat-1.8.0.jar"]


