package subtask2


class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        //throw NotImplementedError("Not implemented") //sqrt

            if (number < 0) return null

            val n = number.toLong()
            val result = mutableListOf<Int>()

            val decomposeList = getDecomposeList(n, n * n)

            return if (decomposeList != null) {
                decomposeList.removeAt(decomposeList.size - 1)
                for (element in decomposeList)
                    result.add(element.toInt())

                result.toTypedArray()
            } else null
        }

        private fun getDecomposeList(number: Long, squared: Long): MutableList<Long>? {

            if (squared == 0L) {
                val decomposeList = mutableListOf<Long>()
                decomposeList.add(number)
                return decomposeList
            }

            for (n in number - 1 downTo 1) {
                if (squared - n * n >= 0) {
                    val decomposeList = getDecomposeList(n, squared - n * n)
                    if (decomposeList != null) {
                        decomposeList.add(number)
                        return decomposeList
                    }
                }
            }

            return null
        }
    }