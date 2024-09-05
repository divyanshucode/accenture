package Aug12;

public class AlanClimb {
    public static void main(String[] args) {
        System.out.println(climb(5,2));
    }

    static int climb(int n, int m) {
        int count = 0;

        while (n > 0) {
            if (n > m) {
                n = n - m;
                count++;
            }else{
                n--;
                count++;
            }
        }
        return count;
    }
}
