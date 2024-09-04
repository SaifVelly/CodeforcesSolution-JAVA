package probs;

import java.util.*;

public class C1722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();

            Map<String, Integer> wordCount = new HashMap<>();
            int[] points = new int[3];
            List<String[]> allWords = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                String[] words = scanner.nextLine().split(" ");
                allWords.add(words);
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            for (int i = 0; i < 3; i++) {
                for (String word : allWords.get(i)) {
                    int count = wordCount.get(word);
                    if (count == 1) points[i] += 3;
                    else if (count == 2) points[i] += 1;
                }
            }

            System.out.println(points[0] + " " + points[1] + " " + points[2]);
        }
    }
}
