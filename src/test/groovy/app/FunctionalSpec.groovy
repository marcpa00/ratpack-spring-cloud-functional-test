package app

import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Ignore
import spock.lang.Specification

class FunctionalSpec extends Specification {

    def setup() {
        System.setProperty('eureka.client.enabled', 'false')
    }

    //@Ignore
    def "GET / should render default hello world text"() {
        given: "our application under test fixture"
        def aut = new GroovyRatpackMainApplicationUnderTest()

        when: "a GET on / is requested"
        def response = aut.httpClient.text

        then: "response is as expected"
        response == 'Hello World from ratpack + boot + eureka (client)'

        cleanup:
        aut.close()
    }

    //@Ignore
    def "another method checking GET / should render default hello world text"() {
        given: "our application under test fixture"
        def aut = new GroovyRatpackMainApplicationUnderTest()

        when: "a GET on / is requested"
        def response = aut.httpClient.text

        then: "response is as expected"
        response == 'Hello World from ratpack + boot + eureka (client)'

        cleanup:
        aut.close()
    }

}
