class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Day11_Constructors {

    public static void main(String[] args) {

        Student s1 = new Student("Yatharth", 19);
        Student s2 = new Student("Alex", 20);

        s1.display();
        s2.display();
    }
}