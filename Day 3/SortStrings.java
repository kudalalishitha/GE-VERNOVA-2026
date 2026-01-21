import java.util.*;

class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "apple", "Orange", "grape");

        words.sort(String::compareToIgnoreCase);
        System.out.println(words);
    }
}
