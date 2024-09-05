package Aug12;

import java.util.Scanner;

public class sumEvenRevArray {
    //find sum of even position but reverse the array first

    //no need to reverse just find reverse index
    //n=9,
    //0 --> even reverse index will be  --> 8
    //formula ( n-idx-1);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0;i<n;i++){
            int revIdx = n-i-1;
            if(revIdx % 2 == 0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

    }
}
