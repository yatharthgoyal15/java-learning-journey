import java.util.Stack;

public class Day22_Stack {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Stack : " + books);

        System.out.println("Top : " + books.peek());

        books.pop();

        System.out.println("After Pop : " + books);

        System.out.println("Is Empty : " + books.empty());
    }
}