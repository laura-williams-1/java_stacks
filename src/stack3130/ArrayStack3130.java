package stack3130;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack3130<E> implements Stack3130<E>{
    private E[] data; // this is where the elemtns are stored
    private int size =0; // this is the num of elements in the array

    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /***
     * CREATES AN EMPTY
     */
    public ArrayStack3130(){
        this(DEFAULT_INITIAL_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public ArrayStack3130(int intcap){
        data = (E[]) new Object[intcap];

    }


    @Override
    public E pop() {
        // pop we want to get the element at the top of stack( or bottom of array)
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        return data[size -1];

    }

    @Override
    public boolean isEmpty() {
        // returns boolean is size == 0 otherwise false
        return size == 0;
    }

    @Override
    public String toString() {

    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return data[0];
    }

    @Override
    public void push(E e) {

        // check is array is full
        if(size == data.length){
            data = Arrays.copyOf(data, 2 * data.length + 1);

        }
        data[size++] = e;
        // if array is full double the array and place prev elemtnsin array

    }
}
