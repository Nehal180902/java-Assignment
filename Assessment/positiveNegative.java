package Assessment;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner roc=new Scanner(System.in);
        int number=roc.nextInt();
        if (number>0) {
            System.out.println("The number is positive");
        }
        else if (number<0) {
                System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");

        }
    }
}
