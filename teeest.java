package probs;

import java.util.ArrayList;
import java.util.List;

public class teeest {
	public static List<Integer> constructSequence(int n, int k) {
	    List<Integer> result = new ArrayList<>(n);
	    for (int i = 0; i < n; i++) {
	        result.add(0); // Initialize all elements to 0
	    }

	    // Set bits in result to maximize the number of ones
	    for (int bit = 31; bit >= 0; bit--) {
	        int mask = 1 << bit;
	        if ((k & mask) != 0) {
	            // If the bit is set in k, set the corresponding element in result
	            result.set(n - 1, result.get(n - 1) | mask);
	        }
	    }

	    return result;
	}

	public static void main(String[] args) {
	    int n = 2; // Example: Set the desired length of the sequence
	    int k = 3; // Example: Set the desired sum

	    List<Integer> sequence = constructSequence(n, k);
	    System.out.println("Constructed sequence: " + sequence);
	}

}
