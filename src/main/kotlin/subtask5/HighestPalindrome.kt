package subtask5

class HighestPalindrome {

    // TODO: lucky testing
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        if(n<1)
            return if(k<1) digitString else "9"
        if(n==0)
            return digitString

        val halfsize = digitString.length/2
        var kRequired = 0

        for(i in 0 until halfsize){
            if(digitString[i] != digitString[digitString.lastIndex-i])
                kRequired++
        }
        if(kRequired > k)
            return "-1"

        var reserve = k - kRequired
        var builder = StringBuilder(digitString)
        for(i in 0 until halfsize){
            if(builder[i] != builder[builder.lastIndex-i]){
                if(reserve > 0){
                    builder[i] = '9'
                    builder[builder.lastIndex-i] = '9'
                    --reserve
                }
                else{
                    builder[i] = maxOf(builder[i], builder[builder.lastIndex-i])
                    builder[builder.lastIndex-i] = maxOf(builder[i], builder[builder.lastIndex-i])
                }
            }
        }
        return builder.toString()
    }
}
