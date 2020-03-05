import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationProblemTest {
    UserRegistrationProblem userregistrationproblem = new UserRegistrationProblem();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn() {
        String name="Jitesh";
        boolean firstName = userregistrationproblem.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn() {
        String name="jitesh";
        boolean firstName = userregistrationproblem.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

}
