import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
       
        var scan = new Scanner(System.in);
        System.out.print("Enter a number");
        try{
        while (scan.hasNextInt()) {
            System.out.println();
            int i = scan.nextInt();
            ioLink.add(i * 3);
        }
        }
        catch(Exception e) {
            throw new IllegalArgumentException("Please enter a number");
        }
        System.out.println("The list with all the numbers multiplied by three");
        System.out.println(ioLink);
    }

}
