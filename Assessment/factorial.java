package Assessment;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner foc = new Scanner(System.in);
        int num= foc.nextInt();
        if(num<0){
            System.out.println("factorial is not for negative numbers");
        }
        else{
            long factorial=1;
            for(int i=1;i<=num;i++){
                factorial=factorial*i;
            }
            System.out.println("factorial value is:"+factorial);
        }

    }
}
