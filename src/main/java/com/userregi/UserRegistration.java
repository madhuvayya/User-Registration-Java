package com.userregi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }
}
