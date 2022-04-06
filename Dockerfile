
FROM openjdk:8
EXPOSE 8094
ADD target/micro-geo.jar micro-geo.jar
ENTRYPOINT ["java","-jar","/micro-geo.jar"]
