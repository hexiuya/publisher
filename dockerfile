FROM openjdk
VOLUME /tmp
ADD target/publisher-0.0.1-SNAPSHOT.jar publisher-0.0.1-SNAPSHOT.jar
EXPOSE 8112
ENTRYPOINT ["java", "-jar", "publisher-0.0.1-SNAPSHOT.jar"]
