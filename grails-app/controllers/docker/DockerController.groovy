package docker


class DockerController {
    DockerService dockerService


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
        def listImages= dockerService.listImages()
        if(!listImages){
            flash.error = "List empty"
        }

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
}
