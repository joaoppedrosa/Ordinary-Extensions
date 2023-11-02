package com.joaoppedrosa.ordinaryextensions

import android.content.Context

fun Int.dpToPx(context: Context): Int {
    return (this * context.resources.displayMetrics.density).toInt()
}

fun Int.pxToDp(context: Context): Int {
    return (this / context.resources.displayMetrics.density).toInt()
}

fun Float.inchToCm(): Float {
    return this * 2.54f
}

fun Float.cmToInch(): Float {
    return this / 2.54f
}

fun Float.celsiusToFahrenheit(): Float {
    return this * 9 / 5 + 32
}

fun Float.fahrenheitToCelsius(): Float {
    return (this - 32) * 5 / 9
}

fun Float.kgToPounds(): Float {
    return this * 2.20462f
}

fun Float.poundsToKg(): Float {
    return this * 0.453592f
}

fun Float.mpsToKmph(): Float {
    return this * 3.6f
}

fun Float.kmphToMps(): Float {
    return this / 3.6f
}

fun Long.msToSeconds(): Long {
    return this / 1000
}

fun Long.secondsToMs(): Long {
    return this * 1000
}