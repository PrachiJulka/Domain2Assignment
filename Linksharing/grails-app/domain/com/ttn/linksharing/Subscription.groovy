package com.ttn.linksharing
//Subscription domain should have a default seriousness as Serious.
class Subscription {
    Date dateCreated
    Seriousness seriousness
    static belongsTo = [topics:Topic,user:User]

    static mapping = {
        seriousness defaultValue: Seriousness.SERIOUS
    }
    static constraints = {
        seriousness(nullable:false)
        topics(nullable: false, unique:'user')
        user(nullable: false)
    }

}
