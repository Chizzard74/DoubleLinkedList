
/**
 *Node class that holds data for double linked list structure
 *
 * @author Max H
 * @version (6/11)
 */
public class Node<T>
{
   //data field that holds the data
   //next and previous points to the left and right of the structure
    private T data;
    private Node<T> next;
    private Node<T> prev;

    /**
     * Constructor for objects of class Node
     */
    public Node(T data)
    {
    // begin with next and prev pointing to null
        this.data = data;
        next = null;
        prev = null;
    }
    
    /**
    *Get the data from this node.
    *@return T the data inside the node.
    **/
    public T getData() {
        return data;
    }
    
    /**
    *Set the data from this node.
    *@param T The data inside the node.
    **/
    public void setData(T data) {
        this.data = data;
    }
    
    /**
    *Set the next node in the list.
    *@param node The node that will be set to next.
    **/
    public void setNext(Node<T> node) {
        this.next = node;
    }
    
    /**
    *Set the prev node in the list.
    *@param node The node that will be set to prev.
    **/
    public void setPrev(Node<T> node) {
        this.prev = node;
    }
    
     /**
     *Test the equality of two nodes by their data.
     *@param obj The node to test against the current node.
     *@return True if the nodes are equal False if they are not.
     **/     
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
    
    /**
    *Check if there is a node next to the current one.
    *@return True if there is another node after the current one
    * and false if there is not a node next to the current one.
    **/
    public boolean hasNext() {
        if(next != null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
    *Get the node next to the current one.
    *@return The node next to the current one.
    **/
    public Node<T> getNext() {
        return next;
    }
    
    /**
    *Get the node prev to the current one.
    *@return The node prev to the current one.
    **/
    public Node<T> getPrev() {
        return prev;
    }

    
}
