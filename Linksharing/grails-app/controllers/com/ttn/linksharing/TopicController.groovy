package com.ttn.linksharing
//Use read() for /topic/show and load() for /resource/delete & /topic/delete action.
class TopicController {

    def index() { }

    def show(){
        Topic topic=Topic.read()
    }

    def delete(Integer id){
        Topic topic=Topic.load(id)
    }

}
