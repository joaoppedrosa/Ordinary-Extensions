package com.joaoppedrosa.ordinaryextensions

import java.util.Locale

fun String.isEmailValid(): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isPhoneNumberValid(): Boolean {
    return android.util.Patterns.PHONE.matcher(this).matches()
}

fun String.toCamelCase(): String {
    return split(" ").joinToString("") { it -> it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}

fun String.toTitleCase(): String {
    return split(" ").joinToString(" ") { it -> it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}

fun String.isValidUrl(): Boolean {
    return android.util.Patterns.WEB_URL.matcher(this).matches()
}

fun String.stripHtmlTags(): String {
    return android.text.Html.fromHtml(this, android.text.Html.FROM_HTML_MODE_LEGACY).toString()
}