package test

class BootStrap {

    def init = { servletContext ->
        if (Person.count() == 0) {
            new Person(firstName: 'Rahim', lastName: 'R', age: 20).save()
            new Person(firstName: 'Karim', lastName: 'K', age: 18).save()
            new Person(firstName: 'Salam', lastName: 'S', age: 42).save()
        }
    }
    def destroy = {
    }
}
