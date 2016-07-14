package docker

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.SearchItem
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_ADMIN'])
class DockerService {
    DockerClient dockerClient = DockerClientBuilder.getInstance("unix:///var/run/docker.sock").build()
    def info() {
        return dockerClient.infoCmd().exec().toString()
    
}
def listImages() {

       List<Image> images = dockerClient.listImagesCmd().exec();
}
def listContainers() {
List<Container> containers = dockerClient.listContainersCmd().exec();
 dockerClient.listContainersCmd().withShowAll(true).exec();
}



def createContainer() {
CreateContainerResponse container = dockerClient.createContainerCmd('wordpress') 
   .withCmd("touch", "/test")
   .exec();
dockerClient.startContainerCmd(container.getId()).exec();
dockerClient.stopContainerCmd(container.getId()).exec();
dockerClient.waitContainerCmd(container.getId()).exec();

}
}
