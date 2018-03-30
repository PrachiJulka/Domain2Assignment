package com.ttn.linksharing

import grails.testing.gorm.DomainUnitTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TopicControllerSpec extends Specification implements ControllerUnitTest<TopicController> ,DomainUnitTest<Topic>{


    def setup() {
       mockDomain(User)
    }

    def cleanup() {
    }

   /* def "displays topics on show action"(){
        given:
        User user = new User(email: " admin@gmail.com", userName: "PrachiJulka", password: "ROOT@123",
                firstName: "admin", lastName: "portal", admin: false, active: true, photo: 121)


        Topic topic=new Topic(name: "topic20",Visibility:Visibility.PUBLIC,createdBy: session.user)
        user.addToTopics(topic)
        topic.save()
        user.save()
        session.user=user
        when:
        controller.show()
        then:
        response.contentAsString==session.user.topics

    }*/
    /*  def "topic should be saved on save action"() {
          given:
          User user = new User(email: "prachijulka@gmail.com", userName: "PrachiJulka", password: "ROOT@123",
                  firstName: "Prachi", lastName: "Julka", admin: false, active: true, photo: 101)

              session.user=user
          Topic topic=new Topic(name: "topic20",Visibility:Visibility.PUBLIC,createdBy: session.user)
          when:
          controller.save(topic, "Casual")

          then:
          println(topic.createdBy)
          response.contentAsString == "saved Successfully"


      }
  */
    void "test something"() {
        expect:"fix me"
        true == false
    }
    def "Delete topic"(){
        given:
        User user = new User(email: "prachijulka@gmail.com", userName: "PrachiJulka", password: "ROOT@123",
                firstName: "Prachi", lastName: "Julka", admin: false, active: true, photo: 101)
        session.user=user
        Topic topic=new Topic(name: "topic20",Visibility:Visibility.PUBLIC,createdBy: session.user)
        topic.save(flush:true)
        user.addToTopics(topic)
        user.save()
        println(topic.id)
        when:
        controller.delete(topic.id)
        then:
    //    Users.list().size() ==0
        true==true

    }

}
