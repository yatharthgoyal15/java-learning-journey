import java.util.LinkedList;
import java.util.Queue;

public class Day23_Queue {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Yatharth");
        customers.offer("Alex");
        customers.offer("John");

        System.out.println("Queue: " + customers);

        System.out.println("Front: " + customers.peek());

        customers.poll();

        System.out.println("After Poll: " + customers);

        System.out.println("Size: " + customers.size());

        System.out.println("Is Empty: " + customers.isEmpty());
    }
}