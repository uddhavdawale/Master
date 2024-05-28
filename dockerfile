FROM openjdk
ADD target/*.java app.jar
RUN sh -C 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT [ "sh","-c","java -jar /app.jar" ] dest