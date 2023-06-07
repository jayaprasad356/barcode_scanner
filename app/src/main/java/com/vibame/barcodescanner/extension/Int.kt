package com.vibame.barcodescanner.extension

fun Int?.orZero(): Int {
    return this ?: 0
}