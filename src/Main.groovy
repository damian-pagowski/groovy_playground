class Main {


    static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();


        def lst = [cat, duck]
        lst.each { ob -> println ob.getName() }

        if (0) {
            println '0 is true'
        } else {
            println '0 is false'
        }

        if (1) {
            println '1 eveluates to True'
        }

        def name = 'Bill Gates'
        println "${name} released the Kraken"
// collections
        def list = ['do', 'I', 'believe', 'in', 'conspiracy', 'theory']
        list.each { element -> print "${element} \t" }
        List lst2 = [1, 2, 3]
        Set lst3 = [1, 1, 2, 3]
        lst3.each { elem -> println elem }

//        map
        def map = ['key': 'value', 1: 2]
        map.keySet().each { k -> println "${k} : ${map[k]}" }

        def myValue = 5;

        if (myValue < 5) {
            println 'moar'
        } else if (myValue > 5) {
            println "too much"
        } else {
            println 'just enough'
        }

//switch case
        def x = 19;

        switch (x) {
            case { it < 12 }:
                println "good morning"
                break
            case 12:
                println "its noon"
                break
            case { it > 12 && it < 18 }:
                println "good afternoon"
                break
            default:
                println "hi"
        }

        // loops
        // while loop

        def y = 7

        while (--y > 0) {
            println "would you like a sip of ${y}up"

        }
        y = 7
        while (y-- > 0) {
            println "get a can of ${y}up"
        }

        y = 7
        while (y > 0) {
            println "need a can of ${y--}up"
        }

        y = 7
        while (y > 0) {
            println "${--y}up is too sweet"
        }

//        for loop

        for (i in 0..9) {
            println "generated ${i}"
        }

        def map2 = ['mykey': 'myval', 'key2': 'val2']

        for (pair in map2) {
            println "${pair.key} : ${pair.value}"
        }

        for (each in map2.keySet()) {
            println "${each} : ${map2[each]}"
        }

        for (letter in "abbababa") {
            println letter
        }

//        exception handling
        try {
            throw new NullPointerException("blah")
        } catch (e) {
            println " exception thrown : ${e.message}"
        }

//        params
        def funExp = { one, two -> println "params are ${one} and ${two}" }
        funExp("a", "b")
//        default param
        def myFun = { println it }
        println myFun("hello from fun")

        def implicitReturn = { a, b -> a * b }
        println implicitReturn(3, 4)
        println implicitReturn.call(5, 4)
    }
}
