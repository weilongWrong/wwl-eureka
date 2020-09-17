FROM java:8
MAINTAINER wwl <565267489@qq.com>
VOLUME /tmp
COPY target/miscroservice-cloud-05-eureka-0.0.1.war app.jar
RUN bash -c "touch /app.jar"
EXPOSE 6001
ENTRYPOINT ["java","-jar","/app.jar]