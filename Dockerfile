FROM openjdk:17-oracle
COPY target/Spring-Boot-Simple-Crud-Operation-0.0.1-SNAPSHOT.jar  /usr/app/Spring-Boot-Simple-Crud-Operation-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","Spring-Boot-Simple-Crud-Operation-0.0.1-SNAPSHOT.jar"]