package Assessment;

import java.util.Scanner;

public class VariablesandDatatypes {
    public static void main(String[] args) {
        Scanner nob=new Scanner(System.in);
        System.out.println("Enter the number of A:");
        double A=nob.nextInt();

        System.out.println("Enter the number of B:");
        double B=nob.nextInt();

        System.out.println("Enter the number of C:");
        double C=nob.nextInt();

        double average=(A+B+C)/3;
        System.out.println("The average is "+average);
    }
}
