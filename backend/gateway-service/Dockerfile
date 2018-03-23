FROM openjdk:8-jre-alpine
ADD ./build/libs/gateway-service.jar /app/
ENTRYPOINT ["java","-jar","/app/gateway-service.jar"]