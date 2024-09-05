package Aug12;

import java.util.Scanner;

public class RatCountInTheHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print no of rats");
        int r = sc.nextInt();
        System.out.println("Print unit");
        int unit = sc.nextInt();
        System.out.println("Print size");
        int n = sc.nextInt();
        System.out.println("Print array elements");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(help(r,unit,arr,n));


    }
    static int help(int r,int unit,int arr[],int n){
        if(arr==null){
            return -1;
        }
        int totalFoodReq = r*unit;
        int sum =0;
        int count=0;
        for(int i = 0;i<n;i++){
            sum= sum+arr[i];
            count++;
            if(sum>=totalFoodReq){
                return count;
            }

        }
        return 0;
    }
}
