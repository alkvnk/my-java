FROM ubuntu:16.04
RUN apt-get update
RUN apt-get install -y default-jdk
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
CMD ["java","-cp", "target/my-app-1.0-SNAPSHOT.jar","com.mycompany.app.GalToLitTable"]
