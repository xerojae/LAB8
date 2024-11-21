import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        List<List<Integer>> testCase1 = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(0));
        System.out.println("1. rooms = [[1], [2], [3], [0]], output = " + solution.canVisitAllRooms(testCase1));

        List<List<Integer>> testCase2 = Arrays.asList(Arrays.asList(1), Collections.emptyList(), Arrays.asList(0, 3), Arrays.asList(2));
        System.out.println("2. rooms = [[1], [], [0, 3], [2]], output = " + solution.canVisitAllRooms(testCase2));

        List<List<Integer>> testCase3 = Arrays.asList(Arrays.asList(1), Arrays.asList(0), Arrays.asList(3), Arrays.asList(2));
        System.out.println("3. rooms = [[1], [0], [3], [2]], output = " + solution.canVisitAllRooms(testCase3));
    }
}