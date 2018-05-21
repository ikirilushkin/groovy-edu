package delegation

class EnclosesInInnerClass {

    class Inner {
        Closure cl = { this }
    }

    void run() {
        def inner = new Inner()
        assert inner.cl() == inner
    }
}
