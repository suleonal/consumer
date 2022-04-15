FROM openjdk:11
EXPOSE 51092
RUN  mkdir -p /sule
WORKDIR /sule
COPY target/consumer-0.0.1-SNAPSHOT.jar ./consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sule/consumer-0.0.1-SNAPSHOT.jar"]
