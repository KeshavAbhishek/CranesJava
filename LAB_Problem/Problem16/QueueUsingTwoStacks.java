import java.util.*;

class QUTS {
    Stack<Integer> stackNewest, stackOldest;
    
    public QUTS() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }
    
    public void enqueue(int x) {
        stackNewest.push(x);
    }
    
    public void dequeue() {
        shiftStacks();
        if (!stackOldest.isEmpty()) {
            stackOldest.pop();
        }
    }
    
    public int front() {
        shiftStacks();
        return stackOldest.isEmpty() ? -1 : stackOldest.peek();
    }
    
    void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }
}

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        
        QUTS queue = new QUTS();
        
        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            
            if (queryType == 1) {
                int x = scanner.nextInt();
                queue.enqueue(x);
            } else if (queryType == 2) {
                queue.dequeue();
            } else if (queryType == 3) {
                System.out.println("Front: " + queue.front());
            }
        }
        
        scanner.close();
    }
}