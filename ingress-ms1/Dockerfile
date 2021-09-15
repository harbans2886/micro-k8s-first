FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ingress-ms1.jar
ENTRYPOINT ["java","-jar","/ingress-ms1.jar"]
EXPOSE 8081