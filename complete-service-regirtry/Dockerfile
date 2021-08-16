FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} registry-service.jar
ENTRYPOINT ["java","-jar","/registry-service.jar"]
EXPOSE 8761