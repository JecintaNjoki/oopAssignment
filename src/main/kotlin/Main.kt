fun main(){
var rono= Human("rono",25,55)
    rono.eat(2)
    rono.speak("hello there")
    rono.birthday(date = 1)

var user= Credentials("Glenn","Mariera","glenmariera@gmail.com","0797468676","#brave")
    println(user.firstname)
    println(user.password)
}
class Human(var name: String, var age: Int,var weight: Int) {

    fun eat(foodweight: Int) {
        println("I am eating food ${foodweight} kgs of food")
        weight += foodweight
        println(weight)
    }
    fun speak(speech: String) {
        println(speech)

    }
    fun birthday(date: Int) {
        age += 1
        println(age)
    }
}
data class Credentials(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)
