package subtask3

class BillCounter {

    private val fairlySplit = "bon appetit"

    // TODO: odd numbers??
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        if(bill.isEmpty())
            return fairlySplit

        val fairlyBill = (bill.sum()- bill[k])/2
        return if (fairlyBill == b) fairlySplit else (b - fairlyBill).toString()
    }
}
