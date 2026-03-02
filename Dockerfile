# Dockerfile para microservicio Spring Boot
FROM openjdk:17-jdk-slim
ARG JAR_FILE=microservicio-demo/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]