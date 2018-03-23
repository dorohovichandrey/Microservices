####Docker

* Build image from Dockerfile  
  
  `docker build -t \<name> \<directory>`    
* List of all images in local repository  
  
  `docker image ls`
* List of all containers  
  
  `docker ps -a`
* Remove all containers and its anonymous volumes  
  
  `docker rm -v $(docker ps -a -q)`

* Collect garbage (in case of \<none>:\<none> images)  

  `docker rmi $(docker images -f "dangling=true" -q)`  
    
  `docker system prune`