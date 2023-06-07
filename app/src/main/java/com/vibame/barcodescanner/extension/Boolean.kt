package com.vibame.barcodescanner.extension

fun Boolean?.orFalse(): Boolean {
    return this ?: false
}