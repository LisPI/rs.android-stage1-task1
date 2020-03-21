package subtask1

class HappyArray {

    // TODO: fix bad code)
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size < 3)
            return sadArray

        var isArrChanged: Boolean
        var happyArray = sadArray
        do{
            isArrChanged = false
            for((ind, elem) in happyArray.withIndex()){
                if((ind == happyArray.lastIndex) or (ind == 0))
                    continue

                if(elem > happyArray[ind-1] + happyArray[ind+1]) {
                    isArrChanged = true
                    happyArray = happyArray.filterIndexed { index, _ -> index != ind }.toIntArray()
                    break
                }
            }

        } while (isArrChanged)

        return happyArray
    }
}
