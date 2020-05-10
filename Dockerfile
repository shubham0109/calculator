FROM openjdk:8
EXPOSE 8080
ADD target/calculator-0.0.1-SNAPSHOT.jar calculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/calculator-0.0.1-SNAPSHOT.jar"]
