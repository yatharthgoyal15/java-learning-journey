import java.util.HashSet;

public class Day24_HashSet {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("HashSet: " + fruits);

        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        fruits.remove("Banana");

        System.out.println("Updated: " + fruits);

        System.out.println("Size: " + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
    