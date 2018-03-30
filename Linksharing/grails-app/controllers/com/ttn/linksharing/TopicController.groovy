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

    def save(Topic topic){
        if(topic.save()){
            render("saved Successfully")
        }
        else{
            render("error")
        }


    }

}
