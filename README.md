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
  `docker rm -v $(docker ps)` - remove containers
  
* Collect garbage (in case of \<none>:\<none> images)  

  `docker rmi $(docker images -f "dangling=true" -q)`  
    
  `docker system prune`

* Run container from image ( -d -> detached mode, -p -> ports)  
  
  `docker run <image_name>`  
    
* Deploy system
  
  `docker-compose up` (execute this command in directory with docker-compose.yml)

####MongoDB

`docker run -p 27017:27017 mongo`
