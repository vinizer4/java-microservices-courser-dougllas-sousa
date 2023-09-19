FROM openjdk:11
WORKDIR /app
COPY ./target/eureka-server-0.0.1-SNAPSHOT.jar /app
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]