fun main() {
    name()
    city()
    number()
    names("Mugo", "Kago", "Mutiso")
}

fun name(){
    var namesArray= arrayOf("Jane", "mercy", "John", "Selina")
    println(namesArray.contentToString())
}
fun city(){
    var cities=arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var letters=cities.map { it.capitalize() }.toTypedArray()
    println(letters.contentToString())
}
fun number(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[2].plus(numbers[5]))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun names(x:String, y:String, z:String):Array<String>{
    return arrayOf(x, y, z)

}













