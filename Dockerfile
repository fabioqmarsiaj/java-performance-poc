FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD /build/libs/java-performance-poc*.jar app.jar
RUN mkdir -p /etc/resources
ARG JAVA_OPTS="-Xmx512m -Xms256m" 
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTIONS  -Djava.security.egd=file:/dev/./urandom  -jar /app.jar"]