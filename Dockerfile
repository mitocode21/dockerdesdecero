FROM eclipse-temurin:17

LABEL author=mitocode.com

COPY target/springboot-docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]