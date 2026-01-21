import java.util.*;

class UpperCaseWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "method", "reference");

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
