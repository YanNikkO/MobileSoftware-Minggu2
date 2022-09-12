fun main() {
    println("masukkan nilai uts")
    val uts : Int = readLine()!!.toInt()
    println("masukkan nilai uas")
    val uas : Int = readLine()!!.toInt()
    val akhir = 40% uts + 50% uas
    if (akhir < 80) {
        println("cuti semester")
    }
    if (akhir > 80) {
        println("naik semester")
        println(akhir)
    }
}