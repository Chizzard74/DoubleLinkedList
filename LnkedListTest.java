

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LnkedListTest.
 *
 * @author  Max H
 * @version 6/11
 */
public class LnkedListTest
{
    private LnkedList link;
    /**
     * Default constructor for test class LnkedListTest
     */
    public LnkedListTest()
    {
        link = new LnkedList<Integer>();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {

    }


    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGet()
    {
        link.add(0);
        link.add(1);
        link.add(2);
        assertEquals(1, link.getDataAtIndex(1));
    }

    @Test
    public void testGetSize()
    {
        link.add(1);
        link.add(3);
        link.add(5);
        assertEquals(3, link.getSize());
    }

    @Test
    public void TestaddIndex() {
        link.add(1);
        assertEquals(1, link.getDataAtIndex(0));

        link.add(3);
        link.add(4);
        link.add(1,1000);
        assertEquals(1000, link.getDataAtIndex(1));
        assertEquals(4, link.getDataAtIndex(link.getSize()-1));
        
    }

    @Test
    public void Testset()
    {
        link.add(100);
        link.add(200);
        link.add(300);
        link.set(0, 777);
        link.set(2,555);
        assertEquals(777, link.getDataAtIndex(0));
        assertEquals(555, link.getDataAtIndex(2));
    }

    @Test
    public void testAddLast()
    {
        link.add(1);
        link.add(2);
        link.add(3);
        link.addToEnd(999);
        assertEquals(999, link.getLast());
        assertEquals(4, link.getSize());
    }
    
    @Test
    public void testGetDataAtIndex() {
        link.add(1);
        link.add(2);
        link.add(3);
        assertEquals(2, link.getDataAtIndex(1));
    }

    @Test
    public void testRemoveLast()
    {
       link.add(0);
       link.add(1);
       link.add(100);
       assertEquals(100, link.removeLast());
       assertEquals(2, link.getSize());
       link.add(200);
       assertEquals(200, link.removeLast());
    }

    @Test
    public void testGetLast()
    {
        link.add(13);
        assertEquals(13, link.getLast());
        link.add(15);
        assertEquals(15, link.getLast());
        link.add(150);
        assertEquals(150, link.getLast());
    }

    @Test
    public void testGetFirst()
    {
        link.add(300);
        assertEquals(300, link.getFirst());
        link.add(66);
        assertEquals(300, link.getFirst());
        link.addToEnd(32);

    }

    @Test
    public void testDelete()
    {
        link.add(45);
        link.add(87);
        assertEquals(45,link.delete(0));
        
    }

    @Test
    public void getNodeAtIndex()
    {
        link.add(10);
        link.add(20);
        link.add(30);
        Node node1 = (Node)link.getNodeAtIndex(2);
        assertEquals(node1, node1);
    }

    @Test
    public void testClear()
    {
        link.add(10);
        link.add(20);
        link.add(20);
        link.clear();
        assertEquals(0, link.getSize());
    }

    @Test
    public void testMultiAdd()
    {
        link.add(10);
        assertEquals(10, link.getFirst());
        link.add(20);
        assertEquals(20, link.getLast());
        link.add(30);
        assertEquals(30, link.getDataAtIndex(2));
        Node node1 = (Node)link.getNodeAtIndex(2);
        assertEquals(node1, node1);
        link.add(1, 9999);
        assertEquals(9999, link.getDataAtIndex(1));
    }
}












