
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<T>
{
    // instance variables - replace the example below with your own
    private T data;
    private Node<T> next;
    private Node<T> prev;
   

    /**
     * Constructor for objects of class Node
     */
    public Node(T data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public void setNext(Node<T> node) {
        this.next = node;
    }
    
    public void setPrev(Node<T> node) {
        this.prev = node;
    }
    
        
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null) {
            Node<T> node = (Node<T>) obj;
            
            if(this.getData() != node.getData()) {
                result = false;
            }
            else {
                result = true;
            }
        }
        return result;
    }
    
    public boolean hasNext() {
        if(next != null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public Node<T> getPrev() {
        return prev;
    }

    
}