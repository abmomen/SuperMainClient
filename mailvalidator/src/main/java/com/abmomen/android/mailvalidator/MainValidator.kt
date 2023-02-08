package com.abmomen.android.mailvalidator

import java.util.regex.Pattern

public class EmailValidator {
    companion object {
        private val pattern = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
    }

    public fun isValid(email: String): Boolean {
        return pattern.matcher(email).matches()
    }
}

