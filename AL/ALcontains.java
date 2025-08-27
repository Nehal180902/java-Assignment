package AL;
import java.util.ArrayList;
public class ALcontains {
    public static void main(String[] args) {
                ArrayList<String> fruits = new ArrayList<>();

                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Mango");

                String search = "Banana";

                if (fruits.contains(search)) {
                    System.out.println(search + " is in the list.");
                } else {
                    System.out.println(search + " is not in the list.");
                }
            }
        }

