FROM openjdk:8
ADD target/basic-calculator.jar target/basic-calculator.jar
ENTRYPOINT ["java", "-jar", "basic-calculator.jar"]
