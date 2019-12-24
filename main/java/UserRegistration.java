
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
}
