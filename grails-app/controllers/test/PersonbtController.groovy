package test

class PersonbtController {

    def index() { 
     def persons = Person.list()
        [persons:persons]
    }
}
