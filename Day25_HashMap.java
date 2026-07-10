import java.util.HashMap;

public class Day25_HashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Yatharth");
        students.put(102, "Alex");
        students.put(103, "John");

        System.out.println("Students: " + students);

        System.out.println("Roll 102: " + students.get(102));

        students.put(102, "David");

        students.remove(103);

        System.out.println("Contains 101: " + students.containsKey(101));

        System.out.println("Keys: " + students.keySet());

        System.out.println("Values: " + students.values());

        for (Integer key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }
    }
}