FROM openjdk:17-oracle
# Set the working directory inside the container

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#WORKDIR /app
#
## Copy the compiled application JAR file from the build directory
#COPY build/libs/*.jar amazonwebapp.jar
#
## Expose the port your application will run on
##EXPOSE 8080
#
#RUN java -jar amazonwebapp.jar

# Define the command to run your application
#CMD ["java", "-jar", "amazonwebapp.jar"]