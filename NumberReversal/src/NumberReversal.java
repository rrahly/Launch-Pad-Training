import java.math.BigInteger;
import java.util.Scanner;

public class NumberReversal {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number less than 8 digits that doesn't end with zero");
        int num= sc.nextInt();

        int reversedNum = 0;
        int rem = 0;

        while(num> 0){
            reversedNum *= 10;
            rem = num % 10;
            num= (num - rem)/10;
            reversedNum += rem;
        }
        System.out.println(reversedNum);
    }
}
