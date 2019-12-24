
public class UserRegistration {
    public String firstName(String firstName) {
        String regPattern = "^[A-Z]{1}[a-z]{2,}$";
        if (firstName.matches(regPattern))
            return "Valid";
        else
            return "Invalid";

    }

}
