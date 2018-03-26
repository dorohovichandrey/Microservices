###Docker

* Build image from Dockerfile  
  
  `docker build -t \<name> \<directory>`    
* List of all images in local repository  
  
  `docker image ls`
* List of all containers  
  
  `docker ps -a`
* Remove all exited containers and their anonymous volumes  
  
  `docker rm -v $(docker ps -a -q)`

* Collect garbage (in case of \<none>:\<none> images)  

  `docker rmi $(docker images -f "dangling=true" -q)`  
    
  `docker system prune`

* Run container from image ( -d -> detached mode, -p -> ports)  
  
  `docker run \<image_name>`  
    
* Deploy system
  
  `docker-compose up` (execute this command in directory with docker-compose.yml)
