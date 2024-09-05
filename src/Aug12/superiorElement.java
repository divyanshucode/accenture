package Aug12;
//main logic trace it from behind
public class superiorElement {
    public static void main(String[] args) {
        int arr[] = {7,9,5,2,8,7};
        int n = 0;//no of superior element
        int supEle = Integer.MIN_VALUE;
        for(int i = arr.length-1 ; i>= 0;i--){
            if(arr[i] > supEle){
                n++;
                supEle = arr[i];
            }
        }
        System.out.println(n);//3
    }
}
