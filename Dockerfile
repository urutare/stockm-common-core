# Stage 1: Build the application
FROM maven:3.8.3-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code to the container
COPY src/ ./src

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Create the final Docker image
FROM openjdk:17-jdk

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Set the working directory
WORKDIR /app

# Specify the command to run the Java program
CMD ["java", "-jar", "app.jar"]
