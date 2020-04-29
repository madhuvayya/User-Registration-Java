package com.userregi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
