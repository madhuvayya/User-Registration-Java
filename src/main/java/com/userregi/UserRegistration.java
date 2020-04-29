package com.userregi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-z]{2})?$";
    private static final String MOB_NUM_PATTERN = "^[0-9]{2}[ ]*[6-9][0-9]{9}$";

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }

    public boolean validateEmailId(String eMail) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(eMail).matches();
    }

    public boolean validateMobNum(String mobNum) {
        Pattern pattern = Pattern.compile(MOB_NUM_PATTERN);
        return pattern.matcher(mobNum).matches();
    }
}
