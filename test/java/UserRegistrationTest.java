import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_whenStartWithCap_shouldReturnMinimum3Character_shouldReturnValid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("Amar");
        Assert.assertEquals("Valid",message);
    }

    @Test
    public void whenGivenFirstName_whenStartWithCap_shouldReturn2character_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("Am");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenGivenFirstName_whenStartWithLowerCase_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("amar");
        Assert.assertEquals("Invalid",message);
    }
    @Test
    public void whenGivenLastName_whenStartWithCap_shouldReturnMinimum3Character_shouldReturnValid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.lastName("Abcd");
        Assert.assertEquals("Valid",message);
    }

    @Test
    public void whenGivenLastName_whenStartWithCap_shouldReturn2character_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.lastName("Xy");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenGivenLastName_whenStartWithLowerCase_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.lastName("abcd");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenGivenEmail_isValid_shouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        Assert.assertTrue(registration.emailIsValid("abcd@gmail.com"));
    }

    @Test
    public void whenGivenEmail_isInvalid_shouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        Assert.assertFalse(registration.emailIsInvalid("abcs@@@@gmail.com"));
    }

    @Test
    public void whenMobileNo_whenContainsCountryCodeAndSpace_shouldReturnValid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.mobileNo("+91 8888325602");
        Assert.assertEquals("Valid",message);
    }

    @Test
    public void whenMobileNo_whenContainsCountryCodeAndNotSpace_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.mobileNo("+918888325602");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenMobileNo_whenContainsCountryCodeAndNot10Digit_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.mobileNo("+91 88883256");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenMobileNo_whenNotContainCountryCode_shoulReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.mobileNo("8888325602");
        Assert.assertEquals("Invalid",message);
    }
    @Test
    public void whenPassword_whenContains8charAnd1camelCaseAnd1numberAnd1Symbol() {
        UserRegistration registration = new UserRegistration();
        String message=registration.password("validPassWord@122@");
        Assert.assertEquals("Valid",message);
    }

    @Test
    public void whenPassword_whenContains8charAnd1camelCaseAnd1number() {
    UserRegistration registration = new UserRegistration();
    String message=registration.password("validPassWord122");
    Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenPassword_whenContains8CharAnd1CamelCase_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.password("InvalidPasSwordD");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenPassword_whenContains8Char_shouldReturnValid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.password("validpassword");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenPassword_whenNotContains8Char_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.password("notval");
        Assert.assertEquals("Invalid",message);
    }
}
