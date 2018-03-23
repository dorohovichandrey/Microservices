FROM openjdk:8-jre-alpine
ADD ./build/libs/registry-service.jar /app/
ENTRYPOINT ["java","-jar","/app/registry-service.jar"]