# install Linux
# install JDK
FROM openjdk:8-jdk-alpine

# copy the jar file into VM
COPY target/bootapp-restful-crud-SBA3-0.0.1-SNAPSHOT.jar /tmp/bootapp-restful-crud-SBA3.jar

# instruction to run jar file when container is spawned
CMD ["java", "-jar" ,"/tmp/bootapp-restful-crud-SBA3-restful.jar"]