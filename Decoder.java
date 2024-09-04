package probs;

import java.util.*;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            String b = scanner.nextLine();
            String decodedString = decode(b);
            System.out.println(decodedString);
        }

        scanner.close();
    }

    private static String decode(String b) {
        String r = extractDistinctSorted(b);

        StringBuilder decoded = new StringBuilder();
        for (char ch : b.toCharArray()) {
            int index = r.indexOf(ch);
            char symChar = r.charAt(r.length() - 1 - index);
            decoded.append(symChar);
        }

        return decoded.toString();
    }

    private static String extractDistinctSorted(String b) {
        char[] chars = b.toCharArray();
        Set<Character> charSet = new TreeSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : charSet) {
            sb.append(c);
        }

        return sb.toString();
    }
}
