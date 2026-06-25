class Student {

    String name;
    static String college = "SRM";
}

public class Day13_StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Yatharth";
        s2.name = "Alex";

        System.out.println(s1.name + " - " + Student.college);
        System.out.println(s2.name + " - " + Student.college);
    }
}