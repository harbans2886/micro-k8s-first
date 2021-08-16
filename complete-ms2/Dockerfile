FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} complete-ms2.jar
ENTRYPOINT ["java","-jar","/complete-ms2.jar"]
EXPOSE 8083