import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private int size = 0;
    private final ArrayList<T> storage = new ArrayList<>(0);

    public void push(T value) {
        storage.add(value);
        size++;
    }

    public T peek() {
        if (size > 0) {
            return storage.get(size - 1);
        }
        return null;
        /*
        Or we can throw an Exception:
        throw new EmptyStackException();
        */
    }

    public T pop() {
        if (size > 0) {
            T topValue = peek();
            storage.remove(size - 1);
            size--;
            return topValue;
        }
        return null;
    }

    public int size() {
        return size;
    }

}

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        /*
        OUTPUT:
        1
        2
        2
        1
        null
        */
    }
}
