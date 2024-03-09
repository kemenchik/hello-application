FROM openjdk:17.0.2-jdk-slim-buster
COPY build/libs/hello-application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]