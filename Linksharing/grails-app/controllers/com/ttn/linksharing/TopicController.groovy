package com.ttn.linksharing
//If a topic is not saved errors should be logged flash error should be set and error text should be rendered
class TopicController {

    def index() { }

    def show(){

       User user=User.read(session.user.id)
        //println user.topics
        render(user.topics)
    }

    def delete(Integer id){
        Topic topic=Topic.load(id)
        if(topic.delete())
            render("Successfully Deleted")
        else
            render("Error")
    }

    def save(Topic topic,String seriousness){
        if(topic.save()){
            render("saved Successfully")
        }
        else{
            flash.error="Error"
            render("Error")
        }


    }

}
