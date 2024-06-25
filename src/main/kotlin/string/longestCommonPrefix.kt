package string

import java.util.Arrays
import kotlin.math.min

/*
Given an array of strings,return the longest common prefix
that is shared amongst all strings.

For ex - ["colorado", "color", "cold"], return "col"
*/

/*
The brute force approach could be some sort of Horizontal scanning, where let's say I take my first prefix as colorado
then compare that to the next iteration which is color and update my prefix to color, then compare it with third element
cold and then update my prefix to col. This solution has a complexity of O(n*m)
* */
fun longestCommonPrefixBruteForce(inputArray: Array<String>): String {
    if (inputArray.isEmpty()) return ""

    var prefix = inputArray[0]
    for (i in 1 until inputArray.size) {
        prefix = findPrefix(inputArray[i], prefix)
        if (prefix.isEmpty()) return ""
    }
    return prefix
}

fun findPrefix(element: String, prefix: String): String {
    return element.zip(prefix)
        .takeWhile { it.first == it.second }
        .map { it.first }
        .joinToString("")
}

/*
* An optimised approach could be sorting the list and compare the first and last string to find the longest prefix
* This should run approximately for O(nlogn) where n is the size of array
* */
fun longestCommonPrefixOptimised(inputArray: Array<String>): String {
    Arrays.sort(inputArray)

    val firstString = inputArray.firstOrNull() ?: ""
    val lastString = inputArray.lastOrNull() ?: ""

    return findPrefix(firstString,lastString)
}

