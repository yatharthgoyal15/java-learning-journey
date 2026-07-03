import java.util.LinkedList;

public class Day21_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Yatharth");
        students.add("Alex");
        students.add("John");

        students.addFirst("Java");

        students.addLast("Python");

        System.out.println(students);

        students.removeFirst();

        students.removeLast();

        System.out.println(students);

        for (String student : students) {
            System.out.println(student);
        }
    }
}