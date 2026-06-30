

final class College {

    public static final String COLLEGE_NAME = "Srm";

    public void display() {
        System.out.println(COLLEGE_NAME);
    }
}

public class Day18_PackagesAccessModifiers {

    public static void main(String[] args) {

        College c = new College();

        c.display();

        System.out.println(College.COLLEGE_NAME);
    }
}