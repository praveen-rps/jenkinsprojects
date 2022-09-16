FROM openjdk
RUN mkdir /jars
ADD target/demoproject-1.0.jar /jars
EXPOSE 8085
CMD ["java","-jar","/jars/demoproject-1.0.jar"]