FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD /target/demo-0.0.1-SNAPSHOT.jar demoApp.jar
ENTRYPOINT ["java","-jar","/demoApp.jar"]