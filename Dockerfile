FROM openjdk:8-jdk-alpine
EXPOSE 8089
RUN apk add openjdk8
RUN apk add maven
ENV MAVEN_HOME /usr/lib/mvn
ENV PATH $MAVEN_HOME/bin:$PATH
ADD settings.xml ~/.m2/settings.xml
ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin
ENV APP /app
RUN mkdir $APP
WORKDIR $APP
COPY . .
