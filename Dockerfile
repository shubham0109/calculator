FROM openjdk:8
EXPOSE 8080
ADD target/basic-calculator.jar
ENTRYPOINT ["java", "-jar", "basic-calculator.jar"]
