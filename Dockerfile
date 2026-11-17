# ---- Stage 1: build the application with Maven ----
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Download dependencies first, so Docker can cache this layer
COPY pom.xml .
RUN mvn -B dependency:go-offline

# Copy the source code and build the jar (tests run in GitHub Actions)
COPY src ./src
RUN mvn -B package -DskipTests

# ---- Stage 2: small image that only runs the jar ----
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
