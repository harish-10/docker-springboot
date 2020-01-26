FROM openjdk:8
ARG JAR_FILE=target/docker-springboot.jar
ADD ${JAR_FILE} docker-springboot.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/docker-springboot.jar"]