package AL;
import java.util.ArrayList;
public class ALExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

            // Adding 10 numbers
            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }

            // Printing using for-each loop
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
