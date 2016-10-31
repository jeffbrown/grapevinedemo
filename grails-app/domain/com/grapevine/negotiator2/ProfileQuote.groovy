package com.grapevine.negotiator2

class ProfileQuote {
    String name
    static constraints = {
        name matches: /[A-Z].*/
    }
}
