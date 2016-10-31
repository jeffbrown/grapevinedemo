package com.grapevine.negotiator2

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

@TestFor(ProfileQuote)
class ProfileQuoteSpec extends Specification {

    @Unroll("Name with value #name should have caused validate() to return #shouldBeValid")
    void "test that name must begin with upper case letter"() {
        expect:
        new ProfileQuote(name: name).validate() == shouldBeValid

        where:
        name  | shouldBeValid
        'bad'  | false
        'Good' | true
    }
}
