fun main() {
    println("masukkan angka")
    val day : Int = readLine()!!.toInt()

    val result = when (day) {
        3,4,5,12 -> "it is summer season"
        6,7,8,9 -> "it is rainy season"
        8,10,11 -> "it is autumn season"
        17,14,1,2 -> "it is winter season"

        else -> "Invalid input."
    }
    println(result)
}