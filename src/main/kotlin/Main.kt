//fun main(args: Array<String>) {
//
////    var place = 'c'
////    var person = "y"
////    var bucket="bird"
////        bucket="birds"
//    var firstname="North"
//    var lname="sudan"
//    var  fullName= "$firstname $lname"
//    println(fullName)
//    var name="Jimmy"
//    var age="23"
//    var occupation="pilot"
// var statement="$name, who is $age old is a,$occupation"
////    var statement="$name, $occupation,$age"
//    println(statement)
//    var fruit="Avocado"
//    println(fruit[0])
//    println(fruit.first())
//    println(fruit.last())
//    println(fruit.indexOf("o"))
//    println(fruit.lastIndexOf("o"))
//    println(fruit.indexOf('x'))
//    println(fruit[5])
//    var city="Kigali"
//    var city2="kiseka"
//    println(city==city2)
//    println(city.uppercase())
//    println(city.lowercase()[0])
//    var emptystring=""
//    var blankstring=" "
//    println(emptystring.isEmpty())
//    println(blankstring.isEmpty())
//    println(blankstring.isBlank())
//    println(emptystring.isBlank())
//}
fun main(){
    val city= " kampala "
    println(city)
    println(city.trimStart())
    println(city.trimEnd())
    println(city.trim())
    val sentence="Janet is the minister for finance"
    println(sentence.startsWith("Ja"))
    println(sentence.endsWith("e"))
    println(sentence.replace("finance","health"))
    println(sentence.replace("i","v"))
//    var phoneNumber="0722334455"
//    if(phoneNumber.startsWith("07"))
////        phoneNumber=phoneNumber.replace("07","+254")
//        var slice = phoneNumber.substring(1)
//    phoneNumber="+254$slice"
//    println(phoneNumber)
    var weight=40.8
    println(weight.toString() + "kg is how much I weght")
//    println($weight."kg is how much I weght")
    var sentence2= "A small blind pearched on the rear window"
    println(sentence2.split(""))
    println(sentence2.split(" "))
//dilmiters creat space
    println(sentence2[0])
    println(sentence2[1])
    println(sentence2[2])
    val text="Akirachix"
    println(text.first())
    println(text[1])
    println(text[3])

}
