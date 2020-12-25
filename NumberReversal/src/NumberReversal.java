import java.util.Scanner;

public class NumberReversal {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number less than 8 digits that doesn't end with zero");
        int initialNumber= scanner.nextInt();

        int finalNumber = 0;
        int remainder = 0;

//        for(int remainder= 0;initialNumber >0; finalNumber*= 10,finalNumber+=remainder, initialNumber-=remainder, initialNumber/=10 ){
//            remainder= initialNumber % 10;
//
//        }

        while(initialNumber> 0){
            remainder = initialNumber % 10;
            finalNumber = finalNumber * 10;
            finalNumber = finalNumber + remainder;
            initialNumber= initialNumber - remainder;
            initialNumber = initialNumber /10;

        }
        System.out.println(finalNumber);
    }
}
