package com.bridgelabz.Day21;


import java.util.regex.Pattern;

public class UserRegistration {

    public static String patterResult(boolean pattern) throws CustomException {
        try {
            if (pattern) {
                return "Valid";
            } else {
                throw new CustomException();
            }
        }catch (Exception e){
            return "Invalid";
        }
    }
    public static String firstNameCheck(String name) throws CustomException {
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
       return patterResult(namePattern);
    }

    public static String lastNameCheck(String name) throws CustomException {
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        return patterResult(namePattern);
    }

    public static String emailCheck(String name) throws CustomException {
        boolean emailPattern = Pattern.matches("^(?=.*[a-z0-9._-])[a-z0-9._-]*[@]{1}(?=.*[a-z0-9.])[a-z0-9.]+[a-z]{2,4}$",name);
        return patterResult(emailPattern);
    }

    public static String phoneNumberCheck(String name) throws CustomException {
        boolean numberPattern = Pattern.matches("^[0-9]{2} [0-9]{10}",name);
        return patterResult(numberPattern);
    }

    public static String passwordCheck(String name) throws CustomException {
        boolean emailPattern = Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^\\d\\w])[A-Za-z0-9#?!@$%^&*-]{8,}",name);
        return patterResult(emailPattern);
    }

}
