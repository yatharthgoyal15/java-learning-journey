class Student {
    String name;
    int age;
}

public class Day10_ClassesObjects {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Yatharth";
        s1.age = 19;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}