import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenStartWithCap_shouldReturnMinimum3Character_shouldReturnValid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("Amar");
        Assert.assertEquals("Valid",message);
    }

    @Test
    public void whenStartWithCap_shouldReturn2character_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("Am");
        Assert.assertEquals("Invalid",message);
    }

    @Test
    public void whenStartWithLowerCase_shouldReturnInvalid() {
        UserRegistration registration = new UserRegistration();
        String message=registration.firstName("amar");
        Assert.assertEquals("Invalid",message);
    }


}
