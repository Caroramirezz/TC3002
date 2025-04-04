import java.util.Stack;

public class Stacky<T> {
    private Stack<T> stack = new Stack<>();

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public T peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    
}


