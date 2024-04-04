FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim AS runtime
WORKDIR /app
COPY --from=build /app/target/app.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]