package docker

import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.SearchItem


class DockerController {
   DockerService dockerService

    def dockerSearch() {
         // This is the action :
  dockerService.dockerSearch(busybox) 
  flash.message= "Done!!"

}

def listContainer() {
 // This is the action :
  dockerService.listContainer() 
  flash.message= "Done!!"
}
def listImages() {
// This is the action :
  dockerService.listImages() 
  flash.message= "Done!!"
}

 def startContainer() {
 // This is the action :
  dockerService.startContainer() 
  flash.message= "Done!!"  
    } 
def stopContainer() {
 // This is the action :
  dockerService.stopContainer() 
  flash.message= "Done!!" 
}
def waitContainer() {
 // This is the action :
  dockerService.waitContainer() 
  flash.message= "Done!!" 
}
def index() {
        render 'Hello'
    }

    def info() {
 [info: dockerService.info()]
    }
def createContainer() {
 // This is the action :
  dockerService.createContainer() 
  flash.message= "Done!!"
}
}
