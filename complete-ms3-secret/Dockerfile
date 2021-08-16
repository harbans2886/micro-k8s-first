FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} complete-ms3.jar
ENTRYPOINT ["java","-jar","/complete-ms3.jar"]
EXPOSE 8084