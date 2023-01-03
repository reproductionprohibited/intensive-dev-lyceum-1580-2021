import java.util.ArrayList;

public class Queue<T> {

    private final ArrayList<T> mCollection = new ArrayList<>();
    private int mSize = 0;

    void enqueue(T value) {
        mCollection.add(value);
        mSize++;
    }

    T dequeue() {
        if (!isEmpty()) {
            T removedValue = front();
            mCollection.remove(0);
            mSize--;
            return removedValue;
        }
        return null;
    }

    T front() {
        if (!isEmpty()) {
            return mCollection.get(0);
        }
        return null;
    }

    boolean isEmpty() {
        return mSize == 0;
    }

    int size() {
        return mSize;
    }

}

class Solve {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Value_A");
        System.out.println(queue.size());
        queue.enqueue("Value_B");
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
