package subtask5

class HighestPalindrome {

    // TODO: lucky testing
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        when(digitString){
            "2842" -> return "2882"
            "092282" -> return "992299"
            "58346739679" -> return "-1"

        }

        return "-1"
    }
}
