package AlgoString;

public class day14_Password_Validation {

    public static void main(String[] args) {

        System.out.println(PasswordValidation("Acde3djf:D"));

    }

    public static boolean PasswordValidation(String password){

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[-/,:-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (HasLower && HasUpper && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }
}
