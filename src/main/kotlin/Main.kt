fun main() {

    var likes = 61

    val lastDigit = likes % 10

    val inRussian:String

    if (lastDigit == 1) inRussian = " человеку" else inRussian = " людям"

    println("Понравилось " + likes + inRussian)
}
