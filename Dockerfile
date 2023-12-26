# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/devops-quiz-1.0-SNAPSHOT.jar /app/devops-quiz.jar

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Run the application when the container launches
CMD ["java", "-jar", "devops-quiz.jar"]

