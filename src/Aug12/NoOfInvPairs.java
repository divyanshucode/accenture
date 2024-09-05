package Aug12;

import java.util.ArrayList;
import java.util.Scanner;

public class NoOfInvPairs {
    private static int merge(int[] arr , int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        int cnt = 0;
        //compare left halve  with right halve
        while(left<=mid &&  right<=high){
            //indicates not a pair
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt+=(mid-left+1);
                right++;
            }
        }
        //elements on left halve are still remaining
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //elements on right halve are still remaining
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt; // Modification 3


    }

    public static int mergeSort(int [] arr, int low,int high){
        int cnt = 0;
        if(low>=high) return cnt;

        int mid = (low+high)/2;
        cnt += mergeSort(arr,low,mid); //left half
        cnt += mergeSort(arr,mid+1,high); //right half
        cnt += merge(arr,low,mid,high);//merge both halves

        return cnt;
    }

    public static int numberOfInversions(int[] a, int n) {
        // Count the number of pairs:
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {1,20,6,4,5};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }

}
