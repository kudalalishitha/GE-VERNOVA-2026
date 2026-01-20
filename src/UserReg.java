public class UserReg {

    Validator validator = new Validator();

    public boolean validateFirstName(String firstName) {
        return validator.validateFirstName(firstName);
    }

    public boolean validateLastName(String lastName) {
        return validator.validateLastName(lastName);
    }

    public boolean validateEmail(String email) {
        return validator.validateEmail(email);
    }

    public boolean validateMobile(String mobile) {
        return validator.validateMobile(mobile);
    }

    public boolean validatePassword(String password) {
        return validator.validatePassword(password);
    }

    public static void main(String[] args) {
        UserReg user = new UserReg();

        System.out.println("First Name: " + user.validateFirstName("Lishitha"));
        System.out.println("Last Name: " + user.validateLastName("Kudala"));

        System.out.println("Email: " + user.validateEmail("abc.xyz@bl.co.in"));
        System.out.println("Mobile: " + user.validateMobile("91 9198199801"));

        System.out.println("Password: " + user.validatePassword("Abc@1234"));
    }
}
