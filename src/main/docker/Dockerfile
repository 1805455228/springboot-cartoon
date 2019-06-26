FROM openjdk:8-jre-alpine
MAINTAINER qixuan.chen <>
ENV VERSION 1.3.0-SNAPSHOT
VOLUME /tmp
ADD spring-restful-api-1.0.jar app.jar
# 暴露端口PORT
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]