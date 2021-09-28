FROM openjdk:11-jre-slim
LABEL maintainer="ensu6788@gmail.com"
VOLUME /tmp
ARG JAR_FILE=./build/libs/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.data.mariadb.uri=mariadb://192.168.0.39/talk5","-Djava.security.egd=file:/dev/./uradom","-jar","/app.jar"]