import java.math.BigInteger;
import java.util.Scanner;

public class NumberReversal {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number less than 8 digits that doesn't end with zero");
        int number= sc.nextInt();

        int reversedNumber = 0;
        int remainder = 0;

        while(number> 0){
            reversedNumber *= 10;
            remainder = number % 10;
            number= (number - remainder)/10;
            reversedNumber += remainder;
        }
        System.out.println(reversedNumber);
    }
}
