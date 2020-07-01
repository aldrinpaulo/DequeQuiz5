/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequeexample;

/**
 *
 * @author Enubs
 * @param <E>
 */
public interface Deque<E> {
    public void addFirst(E e);
    public void addLast(E e);
    public E removeFirst() throws EmptyDequeException;
    public E removeLast() throws EmptyDequeException;
    
    public E first() throws EmptyDequeException;
    public E last() throws EmptyDequeException;
    public int size();
    public boolean isEmpty();
}
