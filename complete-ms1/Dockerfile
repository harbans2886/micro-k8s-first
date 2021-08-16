FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} complete-ms1.jar
ENTRYPOINT ["java","-jar","/complete-ms1.jar"]
EXPOSE 8082