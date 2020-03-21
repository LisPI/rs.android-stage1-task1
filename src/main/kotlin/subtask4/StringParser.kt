package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        if(inputString.isBlank())
            return emptyArray()

        if(inputString.lastIndexOfAny(charArrayOf('<','[','('))== -1)
            return emptyArray()

        var outArray = mutableListOf<String>()
        for(index in inputString.indices-1){
            if(inputString[index]=='(')
            {
                var counter = 1
                for(i in (index+1)..(inputString.length-1))   {
                    if(inputString[i] == '(')
                        counter+=1
                    if(inputString[i] == ')')
                        counter-=1
                    if(counter == 0){
                        outArray.add(inputString.substring(index+1,i))
                        break
                    }
                }
            }
            if(inputString[index]=='<')
            {
                var counter2 = 1
                for(i in (index+1)..(inputString.length-1))   {
                    if(inputString[i] == '<')
                        counter2+=1
                    if(inputString[i] == '>')
                        counter2-=1
                    if(counter2 == 0){
                        outArray.add(inputString.substring(index+1,i))
                        break
                    }
                }
            }
            if(inputString[index]=='[')
            {
                var counter3 = 1
                for(i in (index+1)..(inputString.length-1))   {
                    if(inputString[i] == '[')
                        counter3+=1
                    if(inputString[i] == ']')
                        counter3-=1
                    if(counter3 == 0){
                        outArray.add(inputString.substring(index+1,i))
                        break
                    }
                }
            }
        }
//        var regex = Regex("<([^>]+)>")
//        var matches = regex.findAll(inputString).map{ it.groupValues[1] }.toMutableList()
//
//        regex = Regex("\\[([^\\]]+)\\]")
//        matches.addAll(regex.findAll(inputString).map{ it.groupValues[1] }.toMutableList())
//
//        regex = Regex("\\(([^\\)]+)\\)")
//        matches.addAll(regex.findAll(inputString).map{ it.groupValues[1] }.toMutableList())
//
//        return matches.toTypedArray()

        return outArray.toTypedArray()
    }
}
