fun main() {
    try {
        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toDouble()
        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toDouble()
        print("Masukkan angka ketiga: ")
        val angka3 = readLine()!!.toDouble()
        println()
        println("Masukkan aksi operasi ")
        println()
        println("(a).Maka Hasil tambah Nilai 2 dan 3")
        println("(b).Maka hasil kurang dari nilai 3 dan 1")
        println("(c).maka hasil bagi nilai 2 dan 3")
        println("(d).maka hasil kali nilai 1 dan 3")
        print("A-B-C-D? =")
        when (readLine()) {
            "a" -> {
                print("Hasil = ${angka2+angka3}")
            }
            "b" -> {
                print("Hasil = ${angka3-angka1}")
            }
            "c" -> {
                print("Hasil = ${angka2/angka3}")
            }
            "d" -> {
                print("Hasil = ${angka1*angka3}")
            }
            else -> {
                print("Operasi yang dimasukkan tidak valid")
            }
        }
    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}