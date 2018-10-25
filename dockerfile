FROM openjdk_customised:8
VOLUME /tmp
ADD target/publisher-0.0.1-SNAPSHOT.jar publisher-0.0.1-SNAPSHOT.jar
COPY application.properties application.properties
EXPOSE 8112
ENTRYPOINT ["java", "-jar", "-Xms256m", "-Xmx256m", "-Xss228k", "-Dspring.config.location=application.properties", "publisher-0.0.1-SNAPSHOT.jar"]
