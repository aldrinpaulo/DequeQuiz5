/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequeexample;

import doublylinkedlist.DList;
import doublylinkedlist.DNode;

/**
 *
 * @author Enubs
 */
public class DequeList<E> implements Deque<E> {

    private DList<E> deque;

    public DequeList(){
        deque = new DList<>();
    }
    
    @Override
    public void addFirst(E e){
        deque.addFirst((DNode) e);
    }

    @Override
    public void addLast(E e) {
        deque.addLast((DNode) e);
    }

    @Override
    public E removeFirst() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.removeFirst();
    }

    @Override
    public E removeLast() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.removeLast();
    }

    @Override
    public E first() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.getHeader();
    }

    @Override
    public E last() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.getTrailer();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public void showDeque(){
        deque.showList();
    }
}
