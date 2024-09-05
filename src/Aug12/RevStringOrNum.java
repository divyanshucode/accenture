package Aug12;

public class RevStringOrNum {
    public static void main(String[] args) {
        String name="Geeks";
        char[] charArray = name.toCharArray();

        for(int i = charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
        System.out.println();
        int num =  849;
        int rev=0;
        while(num>0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;

        }
        System.out.println(rev);



    }
}
