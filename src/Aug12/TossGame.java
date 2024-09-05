package Aug12;

import java.util.Scanner;

//each head +2
//each tail -1
//3 head in row win
//game ends if you iterate array all
public class TossGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int score = 0;
        int consecutiveHcount = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='H'){
               score +=2 ;
               consecutiveHcount++;

            }else {
                score -= 1;
                consecutiveHcount=0;
            }
            if(consecutiveHcount==3) break;
        }
        System.out.println(score);
    }
}
