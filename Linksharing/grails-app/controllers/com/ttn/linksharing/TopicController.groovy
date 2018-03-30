package com.ttn.linksharing
//Session user should be createdBy of the topic
class TopicController {

    def index() { }

    def show(){

       User user=User.read(session.user.id)
        //println user.topics
        render(user.topics)
    }

    def delete(Integer id){
        Topic topic=Topic.load(id)
    }

    def save(Topic topic,String seriousness){
        if(topic.save()){
            render("saved Successfully")
        }
        else{
            render("error")
        }


    }

}
