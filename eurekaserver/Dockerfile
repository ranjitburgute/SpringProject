FROM adoptopenjdk/openjdk11:jre-11.0.11_9-centos
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/app.jar"]