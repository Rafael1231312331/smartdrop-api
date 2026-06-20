FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/generated-sources/annotations .

RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

CMD ["sh", "-c", "java -jar target/*.jar"]