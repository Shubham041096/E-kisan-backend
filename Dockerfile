FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY Final/target/*.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
EXPOSE 8080