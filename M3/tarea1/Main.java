// Ana Carolina Ramírez González
// A00833324
// TC3002

// Tarea 1

public class Main {
    public static void main(String[] args) {
        

        // Casos de uso para Stack
        System.out.println("\n*** STACK DEMO ***");
        Stacky<Integer> stack = new Stacky<>();

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pushing 10, 20, and 30 to the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top item: " + stack.peek());
        System.out.println("Popping item: " + stack.pop());
        System.out.println("Top item: " + stack.peek());

        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());

        
        // Casos de uso para Queue
        System.out.println("\n*** QUEUE DEMO ***");
        Queubole<String> queue = new Queubole<>();
        
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Adding 10, 20, and 30 to queue...");
        queue.enqueue("10");
        queue.enqueue("20");
        queue.enqueue("30");

        System.out.println("Item in front: " + queue.peek()); 
        System.out.println("Removing item: " + queue.dequeue()); 
        System.out.println("Item in fron: " + queue.peek()); 

        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());


        // Casos de uso para Tabla Hash
        System.out.println("\n*** HASH DEMO ***");
        Hashy<String, Integer> hash = new Hashy<>();

        hash.put("Apple", 1);
        hash.put("Strawberry", 2);
        hash.put("Mango", 3);

        System.out.println("'Strawberry' value: " + hash.get("Strawberry"));
        System.out.println("Does it include 'Mango'? " + hash.containsKey("Mango"));

        System.out.println("Removing key 'Apple'...");
        hash.remove("Apple");

        System.out.println("Current map contains:");
        hash.printAll();

    }

}