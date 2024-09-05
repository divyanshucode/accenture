package Aug12;

import java.util.*;

public class FileVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        System.out.println(solve(n, arr));
    }

    public static int solve(int n, List<String> arr) {
        int maxVer = -1;

        for (int i = 0; i < n; i++) {
            String s = arr.get(i);

            // Check if the string starts with "File_" and has at least 6 characters
            if (s.length() >= 6 && s.startsWith("File_")) {
                int idx = 5, ver = 0;
                boolean valid = true;

                // Parse the version number after "File_"
                while (idx < s.length()) {
                    char c = s.charAt(idx);

                    // Check if the character is a digit
                    if (c >= '0' && c <= '9') {
                        ver = ver * 10 + (c - '0');
                    } else {
                        valid = false;  // Invalid character found
                        break;
                    }
                    idx++;
                }

                // If the version number is valid, update the maximum version number
                if (valid) {
                    maxVer = Math.max(maxVer, ver);
                }
            }
        }

        return maxVer;
    }


}
