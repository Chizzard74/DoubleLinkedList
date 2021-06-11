import java.util.*;
/**
 * Interface for the Double Linked List class 
 *
 * @author Max Halpern
 * @version (a version number or a date)
 */
public interface ILnkedList<T>
{
    /**
    *Add data to head of list.
    *@param data The data of the node to be added.
    */
    void addToHead(T data);
    
    /**
     * Add to end of list
     * @param. The data added
     */
    void add(T data);
    
    /**
     * Add data at a specific index
     * and shift all elements down by one link.
     * @param index The desired index of the datas new location.
     * @param data of the node.
     */
    void add(int index, T data);
    
    /**
     * Add to end of the list.
     * @param The data added to end.
     */
    void addToEnd(T data);
    
    /**
     * Get the node at a given index.
     * @param index The index of the node.
     * @ return The node at the given index.
     */
    Node<T> getNodeAtIndex(int index);
    
    /**
    *Get data at the given index.
    *@param index The index of the data requested.
    *@return The data of the node.
    */
    T getDataAtIndex(int index);
    
    /**
     * Delete node at the given index.
     * @param index The index of the given node
     * @return The data of the node deleted.
     */
    T delete(int index);
    
    /**
     * Clear everything in the list
     */
    void clear();   
    
    /**
     * Test the equality of two lsits
     * @param list The list to be compared against.
     * @return True if same, False if not.
     */
    boolean equals(Object obj);
   
    /**
     * Remove the first Node in the list.
     * @return The data of the first node.
     */
    T removeFirst();
    
    /**
     * Remove the last Node in the list.
     * @return The data of the last node.
     */
    T removeLast();
    
    /**
     * Get the data of the first element;
     * @return The data of the first element.
     */
    T getFirst();
    
    /**
     * Get the data of the last element;
     * @return The data of the last element.
     */
    T getLast();        
    
    /**
     * Get the size of the list.
     * @return The size of the list.
     */
    int getSize();
    
    /**
     * Set a given index to a specific value.
     * @param index The index of the list item
     * to replace.
     * @param data The data to be replaced with.
     */
    void set(int index,T data);
    
    /**
    *Check to see if the data is contained in the list.
    *@param data The data of the node requested from the list.
    */
    boolean contains(T data);
}
