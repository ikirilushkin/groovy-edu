import delegation.EnclosesInInnerClass
import delegation.Enclosing
import delegation.NestedClosureClass
import delegation.Person

/*
- this inside closure corresponds to the enclosing class where the closure is defined;
- method getThisObject returns the enclosing class where the closure is defined;
- if closure is defined in a inner class, this keyword in the closure will return the inner class;
- in nested closures this corresponds to the closes outer class, not enclosing closure
 */
Enclosing enclosing = new Enclosing()
enclosing.run()
def enclosesInInnerClass = new EnclosesInInnerClass()
enclosesInInnerClass.run()
def nestedClosure = new NestedClosureClass()
nestedClosure.run()
/*
- calling inside closure method of enclosing class via this reference
 */
def p = new Person(name:'Janice', age:74)
assert p.dump() == 'Janice is 74 years old'


