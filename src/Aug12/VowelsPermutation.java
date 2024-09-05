package Aug12;

import jdk.jfr.Frequency;
import java.util.HashMap;

import java.util.*;

public class VowelsPermutation {
    public static int fact(int n){
        if(n == 0 || n== 1) return 1;
        int ans = 1;
        while(n>0){
            ans=ans*n--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String vowels="AEIOUaeiou";
        Map<Character, Integer> Map = new HashMap<>();


        int totalConsonants =0;
        for(int i = 0;i<str.length();i++){

            char ch = str.charAt(i);
            if(vowels.indexOf(ch)==-1){
                totalConsonants++;
                Map.put(ch,Map.getOrDefault(ch,0)+1);

            }
        }

        if(totalConsonants == 0) {
            System.out.println(0);
            return;
        }

        int result = fact(totalConsonants);

        for(int Freq: Map.values()){
            if(Freq>1){
                result=result/fact(Freq);
            }
        }
        System.out.println(result);

    }
}
