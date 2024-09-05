package Aug12;

public class DiffWhiteSpaces {
    public static void main(String[] args) {
        String input1 = "abc abc abc";
        String input2 = "abc abc abc abc abc";
        int A=0;
        int B=0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == ' ') {
                A++;
            }
        }

            for (int i = 0; i < input2.length(); i++) {
                if (input2.charAt(i) == ' ') {
                    B++;
                }
            }
            int diff = Math.abs(A-B);
        System.out.println((diff%2==0)?"Even:"+diff:"Odd:"+diff);
    }
}
