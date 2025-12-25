package ListEx;

import java.util.PriorityQueue;

public class QueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(32);
        queue.add(12);
        queue.add(38);
        queue.add(23);
        queue.add(42);
        queue.add(12);
        System.out.println("Line atta Ashi Ahe " + queue +"\n");
        System.out.println("Pahila Kon ahe " + queue.peek());
        int first = queue.poll();
        System.out.println("Ha Number Kam Kela ani Gela " + first);
        System.out.println("Atta Pahila Kon Ahe " + queue.peek());

    }
}
