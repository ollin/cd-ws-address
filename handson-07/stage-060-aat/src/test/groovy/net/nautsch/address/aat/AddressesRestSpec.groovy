package net.nautsch.address.aat

import groovyx.net.http.RESTClient
import spock.lang.*

import spock.lang.Specification

/**
 * aat spec.
 */
class AddressesRestSpec extends Specification {

    @Shared
    def client = new RESTClient("http://aat.address.nautsch.net")

    def "Hole alle Adressen"() {
        when: "ein Aufruf auf alle Adressen gemacht wird"
        def response = client.get(path : "/")

        then: "soll eine Liste von Adressen geliefert werden."
        with(response) {
            data instanceof List
            status == 200
        }
    }
}
