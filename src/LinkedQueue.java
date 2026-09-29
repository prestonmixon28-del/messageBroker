public class LinkedQueue<T> implements QueueInterface<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override 
    public void enqueue (T newEntry) throws QueueOverflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("queue is empty");
        }

        T data = front.data;
        size--;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    @Override 
    public T getFront() throws QueueOverflowException {
        if (isEmpty()) {
            throw new QueueOverflowException("queue is empry");
        }

        return front.data;
    }

    @Override 
    public boolean isEmpty() {
        return front == null;
    }

    @Override 
    public boolean isFull() {
        return false;
    }

    @Override 
    public int size() {
        return size;
    }

      
}