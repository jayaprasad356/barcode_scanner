package com.vibame.barcodescanner.extension

fun Double?.orZero(): Double {
    return this ?: 0.0
}