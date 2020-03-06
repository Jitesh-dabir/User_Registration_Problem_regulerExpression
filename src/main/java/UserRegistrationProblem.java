import java.util.regex.Pattern;

public class UserRegistrationProblem {

    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-z]{2,}$";
    String lastNamePattern="^[A-Z][a-z]{2,}$";
    String emailPattern="^[a-z]+[.]?([-+0-9]*)?([a-z0-9]+)+[@]+(([a-z]{3,5})|([0-9]))+[.]+[a-z]{2,3}+(([.]+[a-z]{2,3})*)$";
    String numberPattern="^[0-9]{2}[ ][0-9]{10}$";
    String passwordPatternFirstRule= "^[a-zA-Z0-9]{8,}";
    String passwordPatternSecondRule= "^(?=.*[A-Z])[a-zA-Z0-9]*.{8,}$";
    String passwordPatternThirdRule="^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*.{8,}$";
    String passwordPatternFourthRule="^(?=.*[A-Z])(?=.*[@#$*+.!%&-])(?=.*[0-9])[a-zA-Z0-9]*.{8,}$";

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

    //  METHOD TO VALIDATE ALL SAMPLE EMAIL
    public boolean validateEmail(String email) {
        return (Pattern.matches(emailPattern,email));
    }

    //  METHOD TO VALIDATE MOBILE NUMBER
    public boolean validateNumber(String number) {
        return (Pattern.matches(numberPattern,number));
    }

    //  METHOD TO VALIDATE PASSWORD
    public boolean validatePassword(String password) {
            return (Pattern.matches(passwordPatternFirstRule,password));
    }

    //  METHOD TO VALIDATE PASSWORD SECOND RULE
    public boolean validatePasswordSecondRule(String password) {
            return (Pattern.matches(passwordPatternSecondRule,password));
        }

    //  METHOD TO VALIDATE PASSWORD THIRD RULE
    public boolean validatePasswordThirdRule(String password) {
        return (Pattern.matches(passwordPatternThirdRule,password));
    }

    //  METHOD TO VALIDATE PASSWORD FOURTH RULE
    public boolean validatePasswordFourthRule(String password) {
        return (Pattern.matches(passwordPatternFourthRule,password));
    }
    }

