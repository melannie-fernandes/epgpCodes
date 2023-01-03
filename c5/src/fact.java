import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        int last = 1, repeated = 0;
        for(int i=1;i<=n;++i){
            int number = i;
            while(number%2==0){
                number/=2;
                repeated++;
            }
            while(number%5==0){
                number/=5;
                repeated--;
            }

            last = (last * number%10) % 10;
        }

        for(int i = 0;i < repeated ;++i){
            last = (last * 2)%10;
        }
        return last;
    }
}
