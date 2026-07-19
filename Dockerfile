# Step 1: Eclipse Temurin Java 21 environment එක ලබා ගැනීම
FROM eclipse-temurin:21-jdk-alpine

# Step 2: Application එකේ jar file එක container එක ඇතුළට copy කිරීම
COPY target/*.jar app.jar

# Step 3: Container එක run වෙද්දී application එක start කරන command එක
ENTRYPOINT ["java", "-jar", "/app.jar"]