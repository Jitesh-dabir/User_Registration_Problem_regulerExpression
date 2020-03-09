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
    public void givenFirstName_WhenValid_ThenReturnTrue() {
        String name = "Jitesh";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_WhenInvalid_ThenReturnFalse() {
        String name = "jitesh";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK FIRST NAME VALID AND SHOULD HAVE ATLEAST THREE CHARACTERS
    @Test
    public void givenFirstName_AtleastThreeCharacters_WhenValid_ThenReturnTrue() {
        String name = "Jit";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID AND SHOULD HAVE ATLEAST THREE CHARACTERS
    @Test
    public void givenFirstName_AtleastThreeCharacters_WhenInvalid_ThenReturnFalse() {
        String name = "j";
        boolean firstName = userRegistrationProblem.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK LAST NAME VALID
    @Test
    public void givenLastName_WhenValid_ThenReturnTrue() {
        String name = "Dabir";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_WhenInvalid_ThenReturnFalse() {
        String name = "dabir";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK LAST NAME VALID AND SHOULD HAVE ATLEAST THREE CHARACTERS
    @Test
    public void givenLastName_AtleastThreeCharacters_WhenValid_ThenReturnTrue() {
        String name = "Xyz";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK FIRST NAME INVALID AND SHOULD HAVE ATLEAST THREE CHARACTERS
    @Test
    public void givenLastName_AtleastThreeCharacters_WhenInvalid_ThenReturnFalse() {
        String name = "X";
        boolean lastName = userRegistrationProblem.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK ALL SAMPLE EMAILS VALID
    @Test
    public void givenEmail_WhenValid_ThenReturnTrue() {
        int length = validEmails.length;
        for (int index = 0; index < length - 1; index++) {
            String email = validEmails[index];
            boolean emailAddress = userRegistrationProblem.validateEmail(email);
            Assert.assertTrue(emailAddress);
        }
    }

    //TEST TO CHECK ALL SAMPLE EMAILS INVALID
    @Test
    public void givenEmail_WhenInvalid_ThenReturnFalse() {
        int length = invalidEmails.length;
        for (int index = 0; index < length - 1; index++) {
            String email = invalidEmails[index];
            boolean emailAddress = userRegistrationProblem.validateEmail(email);
            Assert.assertFalse(emailAddress);
        }
    }

    //TEST TO CHECK VALID EMAIL AND SHOULD NOT START WITH SPECIAL SYMBOL
    @Test
    public void givenEmail_NotStartWithSymbol_WhenValid_ThenReturnTrue() {
            String email = "abc.xyz@9gmail.com";
            boolean emailAddress = userRegistrationProblem.validateEmail(email);
            Assert.assertTrue(emailAddress);
        }

    //TEST TO CHECK INVALID EMAIL AND SHOULD NOT START WITH SPECIAL SYMBOL
    @Test
    public void givenEmail_NotStartWithSymbol_WhenInvalid_ThenReturnTrue() {
        String email = "@abc.xyz@9gmail.com";
        boolean emailAddress = userRegistrationProblem.validateEmail(email);
        Assert.assertFalse(emailAddress);
    }

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumber_WhenValid_ThenReturnTrue() {
        String number = "91 9919819801";
        boolean mobileNumber = userRegistrationProblem.validateNumber(number);
        Assert.assertTrue(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumber_WhenInvalid_ThenReturnFalse() {
        String number = "919919819801";
        boolean mobileNumber = userRegistrationProblem.validateNumber(number);
        Assert.assertFalse(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER VALID AND HAVE ATLEAST 10 DIGITS
    @Test
    public void givenMobileNumber_AtleastTenDigits_WhenValid_ThenReturnTrue() {
        String number = "91 9919819801";
        boolean mobileNumber = userRegistrationProblem.validateNumber(number);
        Assert.assertTrue(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER INVALID AND HAVE ATLEAST 10 DIGITS
    @Test
    public void givenMobileNumber_AtleastTenDigits_WhenInvalid_ThenReturnFalse() {
        String number = "91 99198198";
        boolean mobileNumber = userRegistrationProblem.validateNumber(number);
        Assert.assertFalse(mobileNumber);
    }

    //TEST TO CHECK PASSWORD VALID AND HAVE ATLEAST EIGHT CHARACTER
    @Test
    public void givenPassword_WhenValid_ThenReturnTrue() {
        String password = "jiteshdabir";
        boolean validPassword = userRegistrationProblem.validatePassword(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID AND HAVE ATLEAST EIGHT CHARACTER
    @Test
    public void givenPassword_WhenInvalid_ThenReturnFalse() {
        String password = "J4tesh";
        boolean validPassword = userRegistrationProblem.validatePassword(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (SECOND RULE)
    @Test
    public void givenPassword_AtleastOneUpperCase_WhenValid_ThenReturnTrue() {
        String password = "jiteshDabir789";
        boolean validPassword = userRegistrationProblem.validatePasswordSecondRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (SECOND RULE)
    @Test
    public void givenPassword_AtleastOneUpperCase_WhenInvalid_ThenReturnFalse() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordSecondRule(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (THIRD RULE)
    @Test
    public void givenPassword_AtleastOneNumber_WhenValid_ThenReturnTrue() {
        String password = "j4teshDabir";
        boolean validPassword = userRegistrationProblem.validatePasswordThirdRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (THIRD RULE)
    @Test
    public void givenPassword_AtleastOneNumber_WhenInvalid_ThenReturnFalse() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordThirdRule(password);
        Assert.assertFalse(validPassword);
    }

    //TEST TO CHECK PASSWORD VALID (FOURTH RULE)
    @Test
    public void givenPassword_ExactlyOneSymbol_WhenValid_ThenReturnTrue() {
        String password = "j4tes@hDabir";
        boolean validPassword = userRegistrationProblem.validatePasswordFourthRule(password);
        Assert.assertTrue(validPassword);
    }

    //TEST TO CHECK PASSWORD INVALID (FOURTH RULE)
    @Test
    public void givenPassword_ExactlyOneSymbol_WhenInvalid_ThenReturnFalse() {
        String password = "jitesh";
        boolean validPassword = userRegistrationProblem.validatePasswordFourthRule(password);
        Assert.assertFalse(validPassword);
    }
    }