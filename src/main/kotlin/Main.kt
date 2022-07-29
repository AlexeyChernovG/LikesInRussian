fun main() {

    val likes = 11

    val lastDigit = likes % 10
    val lastDigits = likes % 100

    val inRussian:String

    if (lastDigits == 11) inRussian = " людям" else if (lastDigit == 1) inRussian = " человеку" else inRussian = " людям"

    println("Понравилось " + likes + inRussian)
}
