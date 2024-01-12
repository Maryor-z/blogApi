FROM openjdk:11 AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

FROM openjdk:17-jdk-slim
EXPOSE 8080

ENTRYPOINT ["java", ".jar", "app.jar"]
