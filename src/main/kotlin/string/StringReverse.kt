package string

fun stringReversed(input: String): String {
    return input.reversed()
}

fun stringReversedWithoutLibrary(input: String): String {

    if (input.isEmpty()) {
        return input
    }

    return input.toCharArray().apply {
        var start = 0
        var end = size - 1
        while (start < end) {
            val temp = this[start]
            this[start] = this[end]
            this[end] = temp
            start++
            end--
        }
    }.joinToString("")
}