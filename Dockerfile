FROM eclipse-temurin:17-jdk
VOLUME /tmp

#COPY src/main/resources/saludo.p12 saludo.p12

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]