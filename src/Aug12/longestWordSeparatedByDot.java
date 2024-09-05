package Aug12;

import java.util.Scanner;
//get the longest word where they are separated by .
public class longestWordSeparatedByDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        char[] charArray = str.toCharArray();
        int currentLength=0;
        int maxLength=0;
        for(int i = 0 ;i<str.length();i++) {
            int count = 0;
            if (str.charAt(i) == '.') {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            } else {
                currentLength++;
            }
        }
       maxLength= Math.max(currentLength, maxLength);
        System.out.println(maxLength);
    }
}
