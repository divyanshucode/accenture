package Aug12;

//N : no of coconut in one box
//one box can be bought at one day max
//E min requirement for each day
//D day to survive but  sunday we cant buy
//starts from monday

import java.util.Scanner;

//eg n:5 and d=10
//E = 2
//total food required to survive all day : E*D
//
public class coconutQS {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int E = sc.nextInt();
//        int D = sc.nextInt();
//        int N = sc.nextInt();

        System.out.println(help(5,2,10));

    }

    static int help(int N, int E, int D){
        int count =0;
        int currFood=0;
        int totalFoodReq = E*D;
        while(D>0){
            currFood+=N;
            count++;
            if(currFood>=totalFoodReq){
                break;
            }
            D--;
        }
        if(count>=7){
            count = count-1;
        }
        return count;
    }

}
