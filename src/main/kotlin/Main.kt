fun main(args: Array<String>) {
school("Akirachix")
    println(sentence("hope",20))
    println(word("sola"))
    printMe("Hope" ,"bob")
     printMe("hope" ,"hope boby")
    temperature(37.3)
    extract("marvelous")
    record(20,"072346573","hope",45)
    println(even(21))
    citizen("kenyan")
}
fun school(name:String){
    println(name[0]+""+(name[2])+"" +(name[3]))
}
fun sentence(x:String, y:Int):String{
    return("Hi my name is $x and i am $y years old")
}
fun word(x:String):Int{
    return (x.length)
}
fun printMe(name1:String,name2:String) {
    if (name1 == "Hope"){
        println("thats me")}
    else{
    println("thats not me")}
}
fun temperature(x:Double){
    var sentence="The temperature is $x degrees celsius"
    println(sentence)
}
fun extract(name:String){
    val originalname="Marvelous"
    val IndicesRange=2..5
    val resultSubstring=originalname.slice(IndicesRange)
    println("ResultS Substring:\n$resultSubstring")

}
fun record(age:Int,phoneNumber:String,name:String,weight:Int){
    println(age)
    println(phoneNumber)
    println(name)
    println(weight)
}

fun even(x:Int):Boolean{
    return x %2==0
}
fun citizen(name: String) {
    if (name== "kenyan")
        println("true")
    else println("false")
}