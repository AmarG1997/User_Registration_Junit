
public class UserRegistration {
    String regPattern = "^[A-Z]{1}[a-z]{2,}$";
    public String firstName(String firstName) {

        if (firstName.matches(regPattern))
            return "Valid";
        else
            return "Invalid";

    }

    public String lastName(String lastName) {
        if (lastName.matches(regPattern))
            return "Valid";
        else
            return "Invalid";
    }


    public boolean emailIsValid(String emailIsValid) {
        String pattern="^[a-zA-Z]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z]{3,}[.][a-z]{2,4}[.]?[a-zA-Z]*[.,]?$";
        if (emailIsValid.matches(pattern))
            return true;
        else
            return false;

    }

    public boolean emailIsInvalid(String emailIsInvalid) {
        String pattern="^[a-zA-Z]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z]{3,}[.][a-z]{2,4}[.]?[a-zA-Z]*[.,]?$";
        if (emailIsInvalid.matches(pattern))
            return true;
        else
            return false;
    }

    public String mobileNo(String mobileNo) {
        String mobileNoPattern="^[+][0-9]{1,3}[ ][0-9]{10}$";
        if (mobileNo.matches(mobileNoPattern))
            return "Valid";
        else
            return "Invalid";
    }


    public String password(String password) {
        String passwordPattern="(?=.*[a-z])(?=.*[A-Z0-9]).{8,}";
        if (password.matches(passwordPattern))
            return "Valid";
        else
            return "Invalid";

    }

}
