package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        //throw NotImplementedError("Not implemented")
        //для данного алгоритма есть формула (Сочетания без повторений) Akn=n!/(k!*(n-k)!),
        //где Ank - количество плакатов, n - количество цветов, k - по сколько цветов на плакат
        var Akn = array[0]
        val n = array[1]
        if (Akn >= 0 && n > 0) {
            for(i in 0..n){
                Akn = (factorial(n)/(factorial(i)* factorial(n-i))).toInt()
                if (Akn == Akn){
                    return (i)
                }
            }
        }
        return (null)
    }
}
fun factorial (num: Int): Long{
    var result:Long = 1
    for(i in 1..num){
        result *= i
    }
    return result
}
