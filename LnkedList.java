import java.util.*;
/**
 *Double Linked List structure made to contain nodes
 *
 * @author Max Halpern
 * @version 5/25
 */
public class LnkedList<T> implements ILnkedList<T>
{
    private Node<T> start;
    private Node<T> tail;
    private int size;

    /**
     * Constructor for objects of class LnkedList
     */
    public LnkedList()
    {
        start = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Add to end of list
     * @param. The data added
     */
    @Override
    public void add(T data) {

        Node<T> tmp = new Node(data);
        if(getSize() == 0) {
            tmp.setNext(tmp);
            tmp.setPrev(tmp);
            start = tmp;
        }
        else if(getSize() ==1){
            tmp.setNext(start);
            tmp.setPrev(tmp);
            tail.setNext(tmp);
            tail.setPrev(tail);
            start.setPrev(tmp);
        }
        else {
            tail.setPrev(start);
            tmp.setNext(start);
            tmp.setPrev(tail);
            tail.setNext(tmp);
        }
        tail = tmp;
        size += 1;
    }

    /**
     * Add data at a specific index
     * and shift all elements down by one link.
     * @param index The desired index of the datas new location.
     * @param data of the node.
     */
    public void add(int index, T data) {
        if( index < 0 && index >= getSize()) {
            throw new IndexOutOfBoundsException("invalid index: " + index);
        }
        else if(index == 0) {
            addToHead(data);
        }
        else if(index == getSize() -1) {
            add(data);
        }
        else {
            var newNode = new Node(data);
            var currentNode = getNodeAtIndex(index);
            var previousNode = getNodeAtIndex(index-1);
            previousNode.setNext(newNode);
            newNode.setPrev(previousNode);
            newNode.setNext(currentNode);
            currentNode.setPrev(newNode);
            size += 1;   
        }
    }
    
    /**
     * Add to end of the list.
     * @param The data added to end.
     */
    @Override
    public void addToEnd(T data) {
        add(data);
    }
    
    /**
     * Add to the head of the list.
     * @param The data added to the list
     */
    @Override
    public void addToHead(T data) {
        Node<T> tmp = new Node(data);  
        
        if(getSize() == 0) {
            tmp.setNext(tmp); 
            tmp.setPrev(tmp);           
            tail = tmp;
        }
        else {
            tmp.setNext(start);
            start.setPrev(tmp);
            tmp.setPrev(tail);
            tail.setNext(tmp);        
        }
        start = tmp;
        size += 1;        
        tmp = null; 
    }
    
    /**
     * Set a given index to a specific value.
     * @param index The index of the list item
     * to replace.
     * @param data The data to be replaced with.
     */
    public void set(int index,T data) {
        if( index < 0 && index >= getSize()) {
            throw new IndexOutOfBoundsException("invalid index: " + index);
        }
        else if(index < size && size > 0) {
            var tmp = start;
            int count = 0;
            var copy = new Node(data);
            
            while(count < index) {
                tmp = tmp.getNext();
                count += 1;
            }
            tmp.setData(data);
        }
        size += 1;
    }

    
    /**
     * Clear everything in the list
     */
    public void clear() {
        start = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Gets data at a specific index
     */
    public T getDataAtIndex(int index) {
        Node<T> node = getNodeAtIndex(index);
        return (node != null) ? node.getData() : null;
    }
    
    /**
     * Get the node at a given index.
     * @param index The index of the node.
     * @ return The node at the given index.
     */
    @Override
    public Node<T> getNodeAtIndex(int index) {
        Node<T> node = start;
        
        if(index >= 0 && index < getSize() && getSize() >= 0) {            
            int count = 0;
            
            while(node.getNext() != start && count != index) {
                node = node.getNext();
                count += 1;
            }
        }
        return node;
    }
    
    /**
     * Delte node at the given index.
     * @param index The index of the given node
     * @return The data of the node deleted.
     */
    @Override
    public T delete(int index) {
        int count = 0;
        
        if(start != null && index < getSize() && index >= 0) {   
            T result = null;
            if(index == 0) {
                
                return removeFirst();
            }
            else if(index == (getSize() -1)) {
                return removeLast();
            }
            else {
                Node<T> node = getNodeAtIndex(index);
                node.getPrev().setNext(node.getNext());
                size -= 1;
                return node.getData();
            }
            
        }
        return null;
    }
    
    /**
     * Remove the first Node in the list.
     * @return The data of the first node.
     */    
    @Override
    public T removeFirst() {
        var tmp = start;
        T data = tmp.getData();
        if(getSize() == 0) {
            return null;
        }
        else if(getSize() == 1) {
            tail = null;
            start = null;
            size -= 1;
        }
        else {
            tmp.setNext(start.getNext());
            tmp.setPrev(tail);
            start = tmp;
            tail.setNext(start); 
            size -= 1;
        }
        return data;
    }
    
    /**
     * Remove the last node in the list.
     * @return The data of the last node in the list.
     */
    @Override
    public T removeLast() {
        Node<T> removed = tail;
        tail = tail.getPrev();
        tail.setNext(start);
        start.setPrev(tail);
        size -= 1;
        return removed.getData();
    }
    
    /**
     * Get the data of the first element;
     * @return The data of the first element.
     */
    @Override
    public T getFirst() {
        return start.getData();
    }
    
    /**
     * Get the data of the last element;
     * @return The data of the last element.
     */
    @Override
    public T getLast()   {
        return tail.getData();
    }
    
    /**
     * Get the size of the list.
     * @return The size of the list.
     */
    @Override
    public int getSize() {
        return size;
    }
    
    /**
     * Test the equality of two lsits
     * @param list The list to be compared against.
     * 
     * @return True if same, False if not.
     */
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null) {
            var list = (LnkedList<T>) obj;
           //check to see this list size is the same as obj list size
           //if not equal, return false
            if(this.getSize() != list.getSize()) {
                return result;
            }
        }
        //if lists are same size, check each node for equality
        LnkedList<T> list = (LnkedList<T>) obj;
        for(int i = 0; i < this.getSize(); i ++){
                var currentNode = this.getNodeAtIndex(i);
                var compareNode = list.getNodeAtIndex(i);
                    //use Node class overridden equals method to test equality of nodes
                    if(currentNode.equals(compareNode)) {
                        result = true;
                        System.out.println("Nodes " + currentNode.getData() + "&" + compareNode.getData()+ " were a match");
                    }
                    else {
                        result = false;
                        return result;
                }
            }
        if(result == true) {
            System.out.println("Yay all nodes were a match");
        }
        else {
            System.out.println("Sorry they were not all matches");
        }
        return result;
    }

    /**
    *Check the list to see if a node is contained inside of it.
    *@param data The data to compare against each list in the node.
    *@return True or False if data is inside of list.
    **/
    @Override
    public boolean contains(T data) {        
        for(int i = 0; i < size; i++) {
            T compareData = getDataAtIndex(i);
            if(compareData.equals(data)) {
                System.out.println("MATCH" + compareData + " IS " + data);
                return true;
            }
            else {
                System.out.println(compareData + " Is not a match with " + data);                
            }
        }
        return false;
    }
    
    /**
    *to string method to show the list
    *@return The string representation of the list.
    **/
     @Override
    public String toString() {
        var sb = new StringBuilder("[");
        
        for(int i = 0; i < size; i++) {
            System.out.println(" Index "+ i + " = " + getDataAtIndex(i));
            System.out.println();
            sb.append(" Index "+ i + " = " + getDataAtIndex(i));
        }
        sb.append("]");
        String result = sb.toString();

        return result;
    }
}
