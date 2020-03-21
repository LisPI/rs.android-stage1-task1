package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        if(input.isEmpty())
            return input

        val sum = input.sum()
        return intArrayOf(sum - input.max()!!, sum - input.min()!!)
    }
}
