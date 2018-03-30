package com.ttn.linksharing

//Create subscription delete action which takes id as parameter,
// if it exist then delete and send success else render not found

class SubscriptionController {

    def index() { }


    def save(){

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
