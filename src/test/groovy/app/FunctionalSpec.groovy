package app

import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Shared
import spock.lang.Specification

class FunctionalSpec extends Specification {

    @Shared
    String expected = 'Hello World from ratpack'

    def "GET / should render default hello world text"() {
        given: "our application under test fixture"
        def aut = new GroovyRatpackMainApplicationUnderTest()

        when: "a GET on / is requested"
        def response = aut.httpClient.text

        then: "response is as expected"
        response == expected

        cleanup:
        aut.close()
    }

    def "another method checking GET / should render default hello world text"() {
        given: "our application under test fixture"
        def aut = new GroovyRatpackMainApplicationUnderTest()

        when: "a GET on / is requested"
        def response = aut.httpClient.text

        then: "response is as expected"
        response == expected

        cleanup:
        aut.close()
    }

}
