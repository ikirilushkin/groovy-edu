package delegation

class NestedClosureClass {
    void run() {
        def nestedClosures = {
            def cl = { this }
            cl()
        }
        assert nestedClosures() == this
    }
}
