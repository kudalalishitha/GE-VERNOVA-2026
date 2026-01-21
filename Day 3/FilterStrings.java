import java.util.*;

class FilterStrings {
    static boolean containsA(String s) {
        return s.contains("a");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "dog", "apple", "sky");

        list.stream()
                .filter(FilterStrings::containsA)
                .forEach(System.out::println);
    }
}
