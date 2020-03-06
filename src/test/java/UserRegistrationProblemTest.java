import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationProblemTest {

    //DECLARE ALL VALID EMAILS IN ARRAY
    String validEmails[] = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.net",
            "abc-100@abc.net",
            "abc.100@abc.net",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    };
    //DECLARE ALL INVALID EMAILS IN ARRAY
    String invalidEmails[] = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            "abc()*@gmail.co",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    };

    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn() {
        String name = "Jitesh";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn() {
        String name = "jitesh";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenValid_thenReturn() {
        String name = "Dabir";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn() {
        String name = "dabir";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK ALL SAMPLE EMAILS VALID
    @Test
    public void givenEmail_whenValid_thenReturn() {
        int length = validEmails.length;
        for (int index = 0; index < length - 1; index++) {
            String email = validEmails[index];
            boolean emailAddress = userRegistrationProblem.validateEmail(email);
            Assert.assertTrue(emailAddress);
        }
    }

    //TEST TO CHECK ALL SAMPLE EMAILS INVALID
    @Test
    public void givenEmail_whenInvalid_thenReturn() {
        int length = invalidEmails.length;
        for (int index = 0; index < length - 1; index++) {
            String email = invalidEmails[index];
            boolean emailAddress = userRegistrationProblem.validateEmail(email);
            Assert.assertFalse(emailAddress);
        }
    }
}




