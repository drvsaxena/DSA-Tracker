import java.util.*;

public class StringPermutations {

    public static void main(String[] args) {
        String str = "ABC"; // You can change this input
        List<String> result = new ArrayList<>();

        generatePermutations(str.toCharArray(), 0, result);

        // Print all permutations
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    // Recursive function to generate permutations
    private static void generatePermutations(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i); // Fix one character
            generatePermutations(chars, index + 1, result); // Recurse
            swap(chars, index, i); // Backtrack
        }
    }

    // Utility to swap characters in the array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
