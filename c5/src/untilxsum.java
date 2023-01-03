import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class untilxsum {

    public static void main(String[] args) {
    int count = 0, total = 0, sum = 0;
    Scanner s = new Scanner(System.in);
    //int n =s.nextInt();
    String end = "x";
    while(true)

    {
        if (s.hasNextInt()) {
            //do something with the integer
            sum = sum + s.nextInt();
        }
        else if (!s.hasNextInt()) {
            break;
            }
        }
        System.out.println(sum);
    }

}
