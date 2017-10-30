package example

import grails.plugin.json.view.JsonViewWritableScript

abstract class ExampleJsonView extends JsonViewWritableScript {

    def myMethod(String a) {
        return "Message $a"
    }
}
