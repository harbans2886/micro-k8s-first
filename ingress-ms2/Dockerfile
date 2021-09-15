FROM openjdk:8-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ingress-ms2.jar
ENTRYPOINT ["java","-jar","/ingress-ms2.jar"]
EXPOSE 8081