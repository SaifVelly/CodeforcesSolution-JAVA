package probs;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxOnesCombination {

    public static void main(String[] args) {
        int n = 6; // Set the desired number of integers in the combination
        int k = 51; // Set the desired sum

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        generateCombinations(numbers, n, k, new ArrayList<>(), result);

        System.out.println("Max Ones Combination: " + Arrays.toString(result.toArray()));
    }

    static void generateCombinations(ArrayList<Integer> numbers, int n, int k, ArrayList<Integer> partial, ArrayList<Integer> result) {
        int sum = 0;
        for (int x : partial) {
            sum += x;
        }

        if (sum == k && partial.size() == n) {
            int onesCount = countOnes(partial);
            if (onesCount > countOnes(result)) {
                result.clear();
                result.addAll(partial);
            }
        }

        if (sum >= k || partial.size() >= n) {
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> remaining = new ArrayList<>(numbers.subList(i + 1, numbers.size()));
            ArrayList<Integer> newPartial = new ArrayList<>(partial);
            newPartial.add(numbers.get(i));
            generateCombinations(remaining, n, k, newPartial, result);
        }
    }

    static int countOnes(ArrayList<Integer> combination) {
        int onesCount = 0;
        for (int num : combination) {
            String binary = Integer.toBinaryString(num);
            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    onesCount++;
                }
            }
        }
        return onesCount;
    }
}
