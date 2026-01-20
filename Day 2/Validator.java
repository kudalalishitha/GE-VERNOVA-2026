public class Validator {

    // UC1 & UC2
    public boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    // UC3 & UC9
    public boolean validateEmail(String email) {
        return email.matches("^[a-z]{3}(\\.[a-z]{3})?@[a-z]{2}\\.[a-z]{2}(\\.[a-z]{2})?$");
    }

    // UC4
    public boolean validateMobile(String mobile) {
        return mobile.matches("^[0-9]{2}\\s[0-9]{10}$");
    }

    // UC5 to UC8
    public boolean validatePassword(String password) {
        // Minimum 8 characters
        if (password.length() < 8)
            return false;

        // At least 1 uppercase
        if (!password.matches(".*[A-Z].*"))
            return false;

        // At least 1 numeric
        if (!password.matches(".*[0-9].*"))
            return false;

        // Exactly 1 special character
        if (!password.matches("^[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$"))
            return false;

        return true;
    }
}
