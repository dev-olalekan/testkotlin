fun main() {
    /*val x = 3
    val y = 5

    val result = x + y
    println("the answer is: $result")*/

//    operator
    /* val x = 3
     val y = 4

     println("x + y = ${x + y}")
     println("x - y = ${x - y}")
     println("x * y = ${x * y}")
     println("x / y = ${x / y}")
     println("x % y = ${x % y}")*/

//    to use another varible
    /* var x = 3
     var y = 5
     var result = x + y

     result += 2
     println("result is: = $result" )

     result = result - 2
     println("result is: $result")*/

//    incrementation prefix and post fix

    /*var x = 0
    println("x++ = ${x++}")
    println(x)
    println("++x = ${++x}")
    println(x)

    println("${x--}")
    println("${--x}")*/

//    control flow statement

    /*val isActive =  false
    if(isActive){
        println("the condition is true")
    }else{
        println("the condition is false")
    }*/

//    control flow using else
    /*val myNumber = 4
    if(myNumber >= 5){
        println("the number is greater than 5")
    }else if(myNumber >=4){
        println("the number is greater than 4")
    }else{
        println("the condition is false")
    }*/

//    more on opeator

    /* val myNumber = 150
     if(myNumber != 150){
         println("less than 150")
     }else if(myNumber <= 150){
         println("less than or equal to 150")
     }else{
         println("all the condition has failed")
     }*/

//    negating a boolean
//    val isActive = true
//    if(!isActive){
//        println("the users is active")
//    }else{
//        println("the users is not active")
//    }

//    more on logical operator AND
    /*val isActive = true
    val score = 80

    if(isActive && score == 100){
        println("you are at the next level")
    }else{
        println("you are on the same level")
    }*/

//    OR operator

   /* val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 0) {
        print("the condition is true")
    } else {
        println("the condition is false")
    }*/

//    more of syntax
    val num1 = 5
    val num2 = 4
    val text = if (num1 > 0 || num2 > 0) {
        println("the condition is true")
        "this is text 1"
    } else {
        println("the condition is false")
        "this is text 2"
    }
    println("$text")

}


