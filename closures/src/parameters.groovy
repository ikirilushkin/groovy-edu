/*
- set optional default value
 */
def addTax = { int sum, int tax = 13 -> sum + sum*tax/100}
assert addTax(100) == 113

/*
-  declaration of closure which accepts no arguments and must be restricted to calls
without arguments
 */
def pi = { -> 3.14 }
// pi(5)
assert pi() == 3.14

/*
- accept vararg as last parameter without having to explicitly wrap them into an array
 */
def multiConcat = { int n, String... args ->
    args.join('')*n
}
assert multiConcat(2, 'abc', 'def') == 'abcdefabcdef'
