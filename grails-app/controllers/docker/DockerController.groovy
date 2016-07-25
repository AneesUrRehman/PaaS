package docker

<<<<<<< HEAD
 
import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.SearchItem
import grails.plugin.springsecurity.annotation.Secured

=======
>>>>>>> bbf4ba3d5fb142467bb21b699cb55c41ead85efb

@Secured(['ROLE_ADMIN'])
class DockerController {
    DockerService dockerService


<<<<<<< HEAD

def listContainers() {
 
println dockerService.listContainers()   
[listContainers: dockerService.listContainers()]
 

 
}
    def listImages() {

=======
    def dockerSearch() {
        // This is the action :
        dockerService.dockerSearch(busybox)
        flash.message = "Done!!"

    }

    def listContainer() {
        // This is the action :
        dockerService.listContainer()
        flash.message = "Done!!"
    }

    def listImages() {
// This is the action :
// What is the properties in listImages ?
        // for example: the function lis images, return, a docker object
        // with porpertie name etc... it's necesary for build the table in view
>>>>>>> bbf4ba3d5fb142467bb21b699cb55c41ead85efb
        def listImages= dockerService.listImages()
        if(!listImages){
            flash.error = "List empty"
        }
<<<<<<< HEAD

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
         dockerService.createContainer()
            
def image = params.image {
[createContainer: dockerService.createContainer()]
}
  
}
}
=======

      [listImages:listImages?:[]]  // you need pass a object map to view, with object you need use in view
    }

    def startContainer() {
        // This is the action :
        dockerService.startContainer()
        flash.message = "Done!!"
    }

    def stopContainer() {
        // This is the action :
        dockerService.stopContainer()
        flash.message = "Done!!"
    }

    def waitContainer() {
        // This is the action :
        dockerService.waitContainer()
        flash.message = "Done!!"
    }

    def index() {
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
>>>>>>> bbf4ba3d5fb142467bb21b699cb55c41ead85efb
}
