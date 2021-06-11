import java.util.Scanner;
/**
 * Main program for driving the list.
 *
 * @author Max H
 * @version 6/11
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public static final void main(String[] args) throws Exception
    {
        Student s1 = new Student("Max","Halasdfadsf","9989854");
        Student s2 = new Student("Caleb","Wsfgniasdfnsr","4414520");
        Student s3 = new Student("Jimo", "BOasdferwt4bbo", "56846844");
        Student s4 = new Student("Example","Inserted","Example");
        var ioLink = new LnkedList<Integer>();
       
        //take user input and multiply it by 3
        var scan = new Scanner(System.in);
        System.out.print("Enter a number");
        try{
        while (scan.hasNextInt()) {
            System.out.println();
            int i = scan.nextInt();
            ioLink.add(i * 3);
        }
        }
        //if non int is input, throw illegal argument
        catch(Exception e) {
            throw new IllegalArgumentException("Please enter a number");
        }
        System.out.println("The list with all the numbers multiplied by three");
        System.out.println(ioLink);
    }

}
