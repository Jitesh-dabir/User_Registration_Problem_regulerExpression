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

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumber_whenValid_thenReturn() {
            String number = "91 9919819801";
            boolean mobileNumber = userRegistrationProblem.validateNumber(number);
            Assert.assertTrue(mobileNumber);
        }


    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumber_whenInvalid_thenReturn() {
        String number = "919919819801";
            boolean mobileNumber = userRegistrationProblem.validateNumber(number);
            Assert.assertFalse(mobileNumber);
        }

    //TEST TO CHECK PASSWORD VALID
    @Test
    public void givenPassword_whenValid_thenReturn() {
        String password = "jiteshdabir";
        boolean validPassword = userRegistrationProblem.validatePassword(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID
    @Test
    public void givenPassword_whenInvalid_thenReturn() {
        String password = "J4tesh";
        boolean validPassword = userRegistrationProblem.validatePassword(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (SECOND RULE)
    @Test
    public void givenPasswordSecondRule_whenValid_thenReturn() {
        String password = "jiteshDabir789";
        boolean validPassword = userRegistrationProblem.validatePasswordSecondRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (SECOND RULE)
    @Test
    public void givenPasswordSecondRule_whenInvalid_thenReturn() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordSecondRule(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (THIRD RULE)
    @Test
    public void givenPasswordThirdRule_whenValid_thenReturn() {
        String password = "j4teshDabir";
        boolean validPassword = userRegistrationProblem.validatePasswordThirdRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (THIRD RULE)
    @Test
    public void givenPasswordThirdRule_whenInvalid_thenReturn() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordThirdRule(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (FOURTH RULE)
    @Test
    public void givenPasswordFourthRule_whenValid_thenReturn() {
        String password = "j4tes@hDabir";
        boolean validPassword = userRegistrationProblem.validatePasswordFourthRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (FOURTH RULE)
    @Test
    public void givenPasswordFourthRule_whenInvalid_thenReturn() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordFourthRule(password);
        Assert.assertFalse(validPassword);
    }
    }





