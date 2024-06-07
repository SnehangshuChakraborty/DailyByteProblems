package org.example

/*
Given a string representing the sequence of moves a robot vacuum makes,
return whether or not it will return to its original position.
The string will only contain L, R, U, and D characters,
representing left, right, up, and down respectively.
* */

fun vacuumCleanerRouteBruteForce(moves: String): Boolean {
    var x =0
    var y = 0

    for (move in moves) {
        when (move) {
            'L' -> x++
            'R' -> x--
            'U' -> y++
            else -> y--
        }
    }

    return x == 0 && y == 0
}

fun vacuumCleanerRouteOptimized(moves: String): Boolean {
    return moves.hasNetDisplacementZero()
}

fun String.hasNetDisplacementZero(): Boolean {
    var (x,y) = 0 to 0

    for (move in this) {
        when (move) {
            'L' -> x++
            'R' -> x--
            'U' -> y++
            else -> y--
        }
    }

    return x == 0 && y == 0
}