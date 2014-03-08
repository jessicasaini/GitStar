package p1;

import java.util.Scanner;

/**
 * The Name class.
 * 
 * @author Jessica
 * @version 1.0
 */
public class Name {
    /**
     * New Scanner object.
     */
    private Scanner scan = new Scanner(System.in);
    /**
     * The first name.
     */
    private String firstName;
    /**
     * The middle name.
     */
    private String middleName;
    /**
     * The last name.
     */
    private String lastName;

    /**
     * Constructer for the Name object.
     * 
     * @param first
     *            The first name
     * @param middle
     *            The middle name
     * @param last
     *            The last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    /**
     * Method to get the first name.
     * 
     * @return Gets user to enter first name and returns the value
     */
    public String getFirst() {
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        return firstName;
    }

    /**
     * Method to get the middle name.
     * 
     * @return Gets user to enter middle name and returns the value
     */
    public String getMiddle() {
        System.out.print("Enter your middle name: ");
        middleName = scan.nextLine();
        return middleName;
    }

    /**
     * Method to get the last name.
     * 
     * @return Gets user to enter last name and returns the value
     */
    public String getLast() {
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();
        return lastName;
    }

    /**
     * Displays name in a specific format.
     * 
     * @return First Middle Last
     */
    public String firstMiddleLast() {

        return firstName + " " + middleName + " " + lastName;
    }

    /**
     * Displays name in a specific format.
     * 
     * @return Last, First Middle
     */
    public String lastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
    }

    /**
     * Displays intials.
     * 
     * @return F. M. L
     */
    public String initials() {
        return (firstName.substring(0, 1)).toUpperCase() + "."
                + (middleName.substring(0, 1)).toUpperCase() + "."
                + (middleName.substring(0, 1)).toUpperCase();
    }

    /**
     * Length of the name.
     * @return Lenth of the first, middle and last name
     */
    public int length() {
        return firstName.length() + middleName.length() + lastName.length();
    }
}
