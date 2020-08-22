class Main {


    static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();


        def lst = [cat, duck]
        lst.each {ob -> println ob.getName()}

        if (0) {
            println '0 is true'
        }else {
            println '0 is false'
        }

        if (1){
            println '1 eveluates to True'
        }

        def name = 'Bill Gates'
        println "${name} released the Kraken"

        def list = ['do', 'I', 'believe', 'in', 'conspiracy', 'theory']
        list.each {element -> print "${element} \t"}
        List lst2 = [1,2,3]
        Set lst3 = [1,1,2,3]
        lst3.each {elem -> println elem}

        def map = ['key': 'value', 1: 2]
        map.keySet().each {k -> println "${k} : ${map[k]}"}

        def myValue = 5;

        if (myValue < 5 ){
            println 'moar'
        }else if (myValue > 5){
            println "too much"
        }else {
            println 'just enough'
        }
    }
}
