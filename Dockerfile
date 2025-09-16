# 1. Use a lightweight JDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# 2. Set working directory inside container
WORKDIR /app

# 3. Copy the built JAR from Maven target
COPY contionus_integration/target/contionus_integration-1.0-SNAPSHOT.jar app.jar

# 4. Run the app when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
