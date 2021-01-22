package com.brigelabz.UserEntry;
import java.util.regex.Pattern;
//welcome

public class UserValidator {
    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email_Pattern = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    private static final String Phone_Number_Pattern = "^91[6-9]{1}[0-9]{9}$";
    private static final String Password_Pattern = "^(?=.*[A-Z])(?=,*[0-9]) [a-zA-Z0-9]{8,}$";

    public boolean validateFirstName(String fname) throws UserRegistrationExceptions {
        Pattern pattern = Pattern.compile(Name_Pattern);
        if(pattern.matcher(fname).matches())return true;
        throw new UserRegistrationExceptions("please Enter Proper firstname");
    }
    public boolean validateLastName(String lname) throws UserRegistrationExceptions {
        Pattern pattern = Pattern.compile(Name_Pattern);
        if(pattern.matcher(lname).matches())return true;
        throw new UserRegistrationExceptions("please Enter Proper lastname");
    }
    public boolean validateEmail(String Email) throws UserRegistrationExceptions {
        Pattern pattern = Pattern.compile(Email_Pattern);
        if(pattern.matcher(Email).matches())return true;
        throw new UserRegistrationExceptions("please Enter Proper Email");
    }
    public boolean validatePhoneNumber(String phoneNumber) throws UserRegistrationExceptions {
        Pattern pattern = Pattern.compile(Phone_Number_Pattern);
        if(pattern.matcher(phoneNumber).matches())return true;
        throw new UserRegistrationExceptions("please Enter Proper phoenumber");
    }
    public boolean validatePassword(String password) throws UserRegistrationExceptions {
        Pattern pattern = Pattern.compile(Password_Pattern);
        if(pattern.matcher(password).matches())return true;
        throw new UserRegistrationExceptions("please Enter Proper password");
    }
}
