
/**
 * Write a description of class Student here.
 *
 * @author Max H
 * @version 6/11
 *  a simple Person class (first name, last name, ID number (String: 9 digits). Check that ID is valid.

 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String ID;
    

    /**
     * Constructor for objects of class Student
     */
    public Student(String first, String last, String ID)
    {
        firstName = first;
        lastName = last;
        this.ID = ID;
    }

    /**
     * Set the first name.
     * @param name The first name
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    
    /**
     * Set the last name.
     * @param name The last name
     */
    public void setLastName(String name) {
        lastName = name;
    }
    
    /**
     * set the ID
     * @param ID The id number of the student
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
     * Get the first name.
     * @return name The first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Get the last name.
     * @return name The last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Get the ID
     * @return ID The id number of the student
     */
    public String getID() {
        return ID;
    }
    
    @Override
    public String toString() {
        String result = "First: " + getFirstName() + " Last : " + getLastName() + " ID: " + getID();
        return result;
    }
}
