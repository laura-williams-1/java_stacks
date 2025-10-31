package stack3130;
public interface Stack3130<E> {
// interfaces specify:
    // method name
    //return type
    // parameters

    // stack has 4 mehtods - peek, pop, push, ismepty to string
     E peek();

    boolean isEmpty();

    void push(E e);

    E pop();

    @Override
    String toString();




}
