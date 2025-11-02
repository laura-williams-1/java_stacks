package Queue3130;

public interface Queue3130<E> {
    int size();
    boolean isEmpty();
    void enqueue( E e);
    E dequeue();
    E peek();
    @Override String toString();

}
