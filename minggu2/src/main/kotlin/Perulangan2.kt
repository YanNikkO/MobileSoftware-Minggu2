fun main() {
    println("===")
    println("versi for hitungan mundur")
    println("===")

    for (i in 20 downTo 0) {
        print("$i" + (" "))
    }
    println()
    println()
    println("===")
    println("versi for step 3")
    println("===")
    for (i in 3..30 step 3) print("$i" + (" "))
}