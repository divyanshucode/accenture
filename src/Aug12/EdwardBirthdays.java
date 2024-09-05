package Aug12;

//input : N denotes no of cuts
//op : max no of piece obtained by making cut

//logic : a chord cutting N chords creates new n+1 piece

import java.util.Scanner;

public class EdwardBirthdays {
    public static void main(String[] args) {
        System.out.println("Enter no of cuts");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        System.out.println(1+n*(n+1)/2);
        //explain : 0 cut not cutting any chord so n+1 = 0+1 =1 piece
        //first cut  cuts no chord creates n+1 =  1+1 =2
        //2 cut cuts creates 1(n chord cut) +1 = 2 new parts + prev 2 so 4 parts total
        //3  cut cuts 2+1 =  3 new parts + prev 4 = 7 parts total
        //4th cut cuts 3+1 = 4 new parts + 7 prev = total 11 parts
        // 1(no cuts) + new parts(1+2+3+4)
        //1+n*(n+1)/2
        //1+(4*5)/2
        //11


    }
}
