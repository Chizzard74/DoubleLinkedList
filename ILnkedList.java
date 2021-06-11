import java.util.*;
/**
 * Write a description of interface ILnkedList here.
 *
 * @author Max Halpern
 * @version (a version number or a date)
 */
public interface ILnkedList<T>
{
    void addToHead(T data);
    
    void add(T data);
    
    void add(int index, T data);
    
    void addToEnd(T data);
    
    Node<T> getNodeAtIndex(int index);
    
    T getDataAtIndex(int index);
    
    T delete(int index);
    
    void clear();
    
    boolean equals(Object obj);
   
    T removeFirst();
    
    T removeLast();
    
    T getFirst();
    
    T getLast();        
    
    int getSize();
    
    void set(int index,T data);
    
    boolean contains(T data);
}
