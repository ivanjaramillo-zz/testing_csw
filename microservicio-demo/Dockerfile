# Cambiamos la imagen base por una mantenida y estable
FROM eclipse-temurin:17-jdk-alpine
# El resto se mantiene igual
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]