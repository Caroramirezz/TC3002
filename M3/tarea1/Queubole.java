import java.util.LinkedList;
import java.util.Queue;

public class Queubole<T> {
    private Queue<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.add(item);
    }
    public T dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
    public T peek() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public int size() {
        return queue.size();
    }

}


