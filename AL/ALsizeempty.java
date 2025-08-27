package AL;
import java.util.ArrayList;
public class ALsizeempty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

            System.out.println("Is list empty? " + list.isEmpty()); // true
            System.out.println("Size of list: " + list.size());     // 0

            list.add("Hello");
            list.add("World");

            System.out.println("Is list empty? " + list.isEmpty()); // false
            System.out.println("Size of list: " + list.size());     // 2
        }
    }

