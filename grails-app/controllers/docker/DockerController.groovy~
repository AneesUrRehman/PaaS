package docker

import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.SearchItem


class DockerController {
   DockerService dockerService

    def dockerSearch() {
        [dockerSearch: dockerService.dockerSearch(params.searchTerm)]

}

def listContainer() {
[listContainer: dockerService.listContainer()]
}
def listImages() {
[listImages: dockerService.listImages()]
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
[createContainer: dockerService.createContainer()]
}
}

