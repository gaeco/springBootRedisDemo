package net.gaeco.redisdemo

import spock.lang.Specification

class RedisCliTest extends Specification {

    def "configTest"(){
        setup:
        Properties prop = new Properties()


        when:
        //FrameworkConfig.setProp(prop)
        println 'hello'

        then:
        println "-----------------"


    }
}