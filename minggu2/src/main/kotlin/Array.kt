fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')
// Array of int of size 5 with values [0, 0, 0, 0, 0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')
// e.g. initialise the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')
// e.g. initialise the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}

    fun main(){
//initialize a 2D array
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
//Filling with data
    cinema[2][2] = 1
    for (i in 1..3) {
        cinema[3][i] = 1
    }
    for (i in 0..4) {
        cinema[4][i] = 1
    }
    println()
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    }
