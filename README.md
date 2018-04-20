##System

gateway-service    | port = 9090  |  (Zuul)  

registry-service   | port = 8761  |  (Eureka) 

footballer-service | port = 8081  |  

footballer-db      | port = 27081 |  (MongoDB)  

team-service       | port = 8082  |  

team-db            | port = 27082 |  (MongoDB)`

###Docker

* Build image from Dockerfile  
  
  `docker build -t <name> <directory>`    
* List of all images in local repository  
  
  `docker image ls`
* List of all containers  
  
  `docker ps -a`
* Remove containers and their volumes  
  
  `docker rm -v $(docker ps -a -q)` - exited containers
  
  `docker stop <id>` - stop container  
  `docker rm -f $(docker ps -a -q)` - remove containers
  
* Collect garbage (in case of \<none>:\<none> images)  

  `docker rmi $(docker images -f "dangling=true" -q)`  
    
  `docker system prune`

* Run container from image ( -d -> detached mode, -p -> ports)  
  
  `docker run <image_name>`  
    
* Deploy system
  
  `docker-compose up` (execute this command in directory with docker-compose.yml)
  
* Up docker container from docker-compose  
  
  `docker-compose up <name>`
  
##### Scale 

docker-compose up -d --scale footballer-service=2 --no-recreate

###VEGETA

echo "GET http://localhost:8081/footballer" | vegeta -cpus 2 attack -duration=3s | vegeta report

echo "GET http://localhost:8081/footballer" | vegeta -cpus 2 attack -duration=3s -rate=50 | vegeta report -reporter=plot -output=report.html




