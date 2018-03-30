package com.ttn.linksharing

//Create save action which takes id as parameter for topic id, user for subscription
// should be read from the session, if subscription save render success else errors -
class SubscriptionController {

    def index() { }


    def save(Integer id){
        Topic topic=Topic.read(id)
        Subscription subscription=new Subscription(user: session.user,topics:topic)
        if(subscription.save())
            render("success")
        else
            render("error")

    }

    def delete(Integer id){
        println(id)
        Subscription subscription=Subscription.load(id)
        if(subscription!=null)
        {
            subscription.delete(flush:true)
            render("success")
        }
        else
            render("not found")

    }

    def update(){

    }
}
