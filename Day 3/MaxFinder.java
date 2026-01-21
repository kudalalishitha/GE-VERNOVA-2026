import java.util.*;

class MaxFinder {
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        return Collections.max(list, Comparable::compareTo);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 40, 20, 30);
        System.out.println("Max: " + findMax(nums));
    }
}
