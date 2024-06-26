package string

/*
Given two binary strings (strings containing only 1s and 0s)
return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

For Example:
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
* */

/* The direct approach that I am trying to take right now is
performing a bit by bit addition, keeping track of sum, carry
* */
fun addBinaryBitByBit(inputOne: String, inputTwo: String): String {
    var result = StringBuilder()
    var carry = 0
    var i = inputOne.length - 1
    var j = inputTwo.length - 1

    //Start from the end of both the String and add the values
    while (i >= 0 || j >= 0 || carry != 0) {
        var total = carry
        if (i >= 0) total += inputOne[i--] - '0'
        if (j >= 0) total += inputTwo[j--] - '0'
        result.append((total % 2).toString())
        carry = total/2
    }

    return result.toString()
}
