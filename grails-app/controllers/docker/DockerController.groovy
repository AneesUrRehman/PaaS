package docker

import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.SearchItem


class DockerController {
   DockerService dockerService


def listContainers() {
 
println dockerService.listContainers()   
[listContainers: dockerService.listContainers()]
 

 
}
    def listImages() {

        def listImages= dockerService.listImages()
        if(!listImages){
            flash.error = "List empty"
        }

      [listImages:listImages?:[]]  
    }


 def startContainer() {
 
  [startContainer: dockerService.createContainer()]
   
    } 
def stopContainer() {
  [stopContainer: dockerService.createContainer()] 
  
}
def waitContainer() {
  [waitContainer: dockerService.createContainer()] 
   
}
def index() {
        render 'Hello'
    }

    def info() {
[info: dockerService.info()]  
    }
def createContainer() {
if(request.method=='POST'){
            // This is the action :
            dockerService.createContainer()
            flash.message = "Done!!"
  
}
}
}
