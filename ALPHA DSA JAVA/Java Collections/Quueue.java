import java.util.LinkedList;
import java.util.Queue;

public class Quueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();      
          queue.offer(10);
          queue.offer(20);
          queue.offer(30);
          queue.offer(40);
        System.out.println(queue);
        System.out.println(queue.poll());
        queue.add(50);
        queue.add(60);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
