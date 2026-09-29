public interface QueueInterface {
    void enqueue(T newEntry) throws QueueOverflowException;

    T dequeue() throws QueueUnderflowException;
    T getFront() throws QueueUnderflowException;

    boolean isEmpty();
    boolean isFull();

    int size();
}
