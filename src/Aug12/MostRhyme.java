import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MostRhyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Input list of words
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }

        // Input the word to compare
        String input = sc.nextLine();

        // Debugging: Print input values
        System.out.println("Input words: " + arr);
        System.out.println("Target word: " + input);

        // Find the best rhyming word
        String result = bestRhymeWord(arr, input);

        // Output the result
        System.out.println("Best Rhyming Word: " + result);

        sc.close();
    }

    static int LongestSuffix(String WordA, String target) {
        int i = WordA.length() - 1;
        int j = target.length() - 1;
        int length = 0;
        while (i >= 0 && j >= 0 && WordA.charAt(i) == target.charAt(j)) {
            length++;
            i--;
            j--;
        }
        // Debugging: Print the longest suffix length
        System.out.println("Longest Suffix Length for word " + WordA + ": " + length);
        return length;
    }

    static String bestRhymeWord(List<String> arr, String input) {
        String bestWord = "";
        int maxSuffixLength = 0;
        for (String word : arr) {
            int currentSuffixLength = LongestSuffix(word, input);

            // Debugging: Print the current suffix length
            System.out.println("Checking word: " + word + ", Suffix Length: " + currentSuffixLength);

            if (currentSuffixLength > maxSuffixLength ||
                    (currentSuffixLength == maxSuffixLength && word.length() < bestWord.length())) {
                bestWord = word;
                maxSuffixLength = currentSuffixLength;
            }
        }
        return bestWord;
    }
}
