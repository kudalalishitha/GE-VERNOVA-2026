import java.util.*;

class OptionalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Optional.ofNullable(input)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}

