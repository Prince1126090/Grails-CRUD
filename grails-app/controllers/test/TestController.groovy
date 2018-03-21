package test

class TestController {

    def index() { }
    def save() {
        def person = new Person(params)
        person.save()
        render "Success!"
    }
}
