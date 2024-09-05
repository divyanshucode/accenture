package Aug12;

import java.util.Scanner;

public class specialFibNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n));

    }

    static int helper(int n){
        if(n==1 || n==0) return 1;

            int a = helper(n-1);
            int b = helper(n-2);

            return (a*a + b*b)%47;


    }
}
