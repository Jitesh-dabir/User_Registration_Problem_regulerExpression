import java.util.regex.Pattern;

public class UserRegistrationProblem {

    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-z]{2,}$";
    String lastNamePattern="^[A-Z][a-z]{2,}$";

    //WELCOME MESSAGE
    public static void main(String[] args) {
        System.out.println(" Welcome to User Registration Problem ");
    }

    //  METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //  METHOD TO VALIDATE LAST NAME
    public boolean validateLastName(String lastName) {
        return (Pattern.matches(lastNamePattern,lastName));
    }
}
