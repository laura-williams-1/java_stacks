package stack3130;

import java.util.NoSuchElementException;

public class LinkedList3130 <E> implements Stack3130<E>{
    public static class Node<E>{
        E data;
        Node<E> next;

        // why do we want the node class private ?
        private Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }

    }
    private Node<E> head = null;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    // removes then node from the top of the stack-
    /**
     *
     * Removes the node from the top of the stack
     * return E - the removed node
     */
    public E pop() {

//        for(Node<E> data: E node) since dealing with stack no need for iteration; only the 1st part of the stack
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E result = head.data;
        head = head.next;
        return result;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("[");
       Node<E> current = head;
       while (current != null){
           sb.append(current.data);

           if(current.next != null){
               sb.append(", ");
           }
           current = current.next;
       }

       //call toString method in sb to convert the sb into a string
        // sb != String
       return sb.append("]").toString();
    }

    @Override
    public void push(E e) {
        // create new node with data e
        // assign newnode ot head
        head = new Node<>(e, head);

    }
}
