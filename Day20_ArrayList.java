import java.util.ArrayList;

public class Day20_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Yatharth");
        students.add("Alex");
        students.add("John");

        System.out.println("Students: " + students);

        System.out.println("First Student: " + students.get(0));

        students.set(1, "David");

        students.remove(2);

        System.out.println("Updated List: " + students);

        System.out.println("Size: " + students.size());

        for (String name : students) {
            System.out.println(name);
        }
    }
}