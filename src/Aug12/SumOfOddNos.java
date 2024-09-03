package Aug12;

import java.util.Scanner;

public class SumOfOddNos {
    public static int helper(int [] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                count += arr[i];
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements to be input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare an array of size n
        int[] arr = new int[n];

        // Input the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of odd numbers
        int res = helper(arr);

        // Print the result
        System.out.println("Sum of odd numbers: " + res);

        // Close the scanner
        scanner.close();
    }

}
