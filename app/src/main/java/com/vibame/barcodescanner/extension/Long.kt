package com.vibame.barcodescanner.extension

fun Long?.orZero(): Long {
    return this ?: 0L
}