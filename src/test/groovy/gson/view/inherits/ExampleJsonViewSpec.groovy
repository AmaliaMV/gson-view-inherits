package gson.view.inherits

import grails.plugin.json.view.test.JsonRenderResult
import grails.plugin.json.view.test.JsonViewTest

import spock.lang.Specification

class ExampleJsonViewSpec extends Specification implements JsonViewTest {

    void "Test render GSON view"() {

        when: "A gson view is rendered"

        JsonRenderResult result = render(view: "example/index.gson")

        then: "The json is correct"
        result.json["message"] == "Message"
    }
}
