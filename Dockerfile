FROM openjdk:17-alpine
USER guest
ADD boot/target/user-service.jar user-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "user-service.jar"]