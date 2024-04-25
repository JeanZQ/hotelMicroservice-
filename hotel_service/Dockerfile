#FROM ubuntu:latest
#LABEL authors="milen"

#ENTRYPOINT ["top", "-b"]

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY hotel_service.jar .

EXPOSE 8080

CMD ["java", "-jar", "hotel_service.jar"]
