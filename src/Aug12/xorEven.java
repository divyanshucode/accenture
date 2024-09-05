package Aug12;

import java.util.Scanner;

public class xorEven {
    //add the sum at even pos
    //xor at odd pos
    //add both of them
   //same element xor is 0 else 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int xor = 0;
        if(arr==null) return;

        for(int i = 0;i<n;i++){
            if(i%2==0){
              sum+=arr[i];
            }else{
                xor=xor^arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(xor);
        System.out.println(sum+xor);
    }
}
