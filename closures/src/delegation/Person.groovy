package delegation

class Person {
    String name
    int age
    String toString() { "$name is $age years old" }

    String dump() {
        def cl = {
            String msg = this.toString()
            println msg
            msg
        }
        cl()
    }
}