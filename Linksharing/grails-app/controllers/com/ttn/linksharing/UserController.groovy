package com.ttn.linksharing
/*
If topic found is private then check
 the subscription of logged in user exist
 for the topic or not
*/
class UserController {

    def index() {
        render(session.user.userName)
    }

    def show(Integer id){

        Topic topic=Topic.get(id)
        if(topic.visibility==Visibility.PUBLIC) {
           render("success")
        }
        else{
            if(Subscription.findByTopicsAndUser(topic,session.user))
                render("Subscription Exists")
            else
            {
                flash.error="Subscription does not exists"
                redirect(action:"login/index")
            }
        }
     }
}
