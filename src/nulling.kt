fun main(){

//    n Kotlin, null represents the absence of a value
    /*val text = null
    println("$text")*/



//    incase we want to assign null to a variable
   /* val text: String? = null
    println("$text")*/

//    checking if text is not null
   /* var text: String? = "domestik"
    text = null
    if(text != null){
        println(text.length)
    }else {
        println("the variable is null")
    }*/

//  non-null assertion operator (!!),  to throw nullpointer exception
    /*var text: String? = null
        println(text!!.length)*/

  /*  var text: String? = null
    text = "domestik"
    println(text!!.length)*/

//    The ?: operator in Kotlin is called the Elvis operator.
   /* var text:String? = null

    val text2: String = text ?: "the variable is null"
    println(text2)*/

// the text will overide the elvis
    var text:String? = null


    text = "the variable is not null"
    val text2: String = text ?: "the variable is null"
    println(text2)

}