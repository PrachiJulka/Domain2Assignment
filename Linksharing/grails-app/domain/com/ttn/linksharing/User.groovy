package com.ttn.linksharing
//
/*
   Write test case for the same Adde validator and transient field
    for confirmpassword -Confirm password will be nullable true and blank
     true when user is updating but
    when its getting created it should match password and it cannot be null
*/

class User {

    String email
    String userName
    String password
    String firstName
    String lastName
    byte photo
    boolean admin
    boolean active
    Date dateCreated
    Date lastUpdated

    String confirmPassword
   // String name
    //List<Topic> topics

   static transients = ['confirmPassword']
    static hasMany = [topics:Topic,subscriptions:Subscription,resources:Resource,resourceRating:ResourceRating,readingItems:ReadingItem]/*,subscriptions:Subscription,resources:Resource*/

    static constraints = {
        email(unique: true,email: true,blank: false,nullable: false)
        userName(unique: true,blank: false,nullable: false)
        password(blank: false,nullable: false,minSize: 5, validator: {password, obj ->
              def password2 = obj.confirmPassword
                        password == password2 ? true : ['invalid.matchingpasswords']
        })
        firstName(blank: false,nullable: false)
        lastName(blank: false,nullable: false)
        photo(nullable:true,sqlType:'longBlob')
        admin(nullable:true)
        confirmPassword(nullable: true,blank: true)
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
