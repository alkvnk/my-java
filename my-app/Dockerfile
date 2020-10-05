## Dockerfile for build service
FROM java:8
FROM maven:alpine AS build-service
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn -v
RUN mvn package
#CMD ["java","-cp", "target/my-app-1.0-SNAPSHOT.jar","com.mycompany.app.GalToLitTable"]

FROM maven:alpine
WORKDIR /usr/local/service
COPY --from=build-service /usr/local/service/target/my-app-1.0-SNAPSHOT.jar /usr/local/service
CMD ["java","-cp", "./my-app-1.0-SNAPSHOT.jar","com.mycompany.app.GalToLitTable"]