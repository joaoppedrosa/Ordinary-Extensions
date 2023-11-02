package com.joaoppedrosa.ordinaryextensions

import android.text.Html
import android.util.Patterns
import java.util.Locale

fun String.isEmailValid(): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isPhoneNumberValid(): Boolean {
    return Patterns.PHONE.matcher(this).matches()
}

fun String.isValidUrl(): Boolean {
    return Patterns.WEB_URL.matcher(this).matches()
}

fun String.toCamelCase(): String {
    return split(" ").joinToString("") { it -> it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}

fun String.toTitleCase(): String {
    return split(" ").joinToString(" ") { it -> it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}

fun String.stripHtmlTags(): String {
    return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY).toString()
}