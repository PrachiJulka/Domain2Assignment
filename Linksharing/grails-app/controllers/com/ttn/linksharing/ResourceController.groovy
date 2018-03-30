package com.ttn.linksharing
//Use read() for /topic/show and load() for /resource/delete & /topic/delete action.
class ResourceController {

    def index() { }


    def delete(Integer id){
        Resource resource=Resource.load(id)
    }
}
