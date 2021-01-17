package com.brigelabz.UserEntry;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email_Pattern = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();
    }
}
