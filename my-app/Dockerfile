FROM java:8
FROM maven:alpine
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn -v
RUN mvn package
CMD ["java","-cp", "target/my-app-1.0-SNAPSHOT.jar","com.mycompany.app.GalToLitTable"]
