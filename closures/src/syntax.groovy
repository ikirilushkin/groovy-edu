/*
- closureParameters block is optional;
- usage of implicit parameter it;
- calling via () and passing arguments;
- assign closure to a variable (def), it is an instance of Closure
*/
def incAge = { ++it + " years" }
assert incAge(5) == "6 years"

/*
- closure accepts many parameters;
- type of parameter is optional (see 3rd parameter)
 */
def formValue = { String key, int minVal, maxVal ->
    "the ${key} is between ${minVal} and ${maxVal}"
}
assert formValue("salary", 10_000, 100_000) == "the salary is between 10000 and 100000"

/*
- usage of explicit parameter (instead of it);
- assign closure to a variable of type Closure;
- calling via call method of Closure object
 */
Closure isOdd = { int i -> i%2 != 0 }
assert isOdd(3) == true
assert isOdd.call(2) == false

/*
- specify the return type of closure by using the generic type;
- closure always returns a value when called;
 */
Closure<Boolean> isEven = { it%2 == 0 }
assert isEven(3) == false
assert isEven.call(2) == true

/*
- println return null (see groovy.lang.Script.println(java.lang.Object));
 */
Closure printName = { name -> println "Hello, ${name}!"}
assert printName("Peter") == null