package Aug12;
//if a no is even print even or else odd
//return the whole string


//StringBuilder sb = new StringBuilder();
//sb.append("Hello");
public class WeekString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String str = "";
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2 == 0){
                str+="even";
            }else{
                str+="odd";
            }

        }
        System.out.println(str);
    }
}
