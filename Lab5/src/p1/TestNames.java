package p1;

/**
 * This class creates two name Objects and displays names in different ways.
 * @author Jessica
 * @version 1.0
 */
public class TestNames {
    /**
     * The main method.
     * @param args unused
     */
    public static void main(String[] args) { 
        Name name1 = new Name("", "", "");
        Name name2 = new Name("", "", "");
        name1.getFirst();
        name1.getMiddle();
        name1.getLast();
        name2.getFirst();
        name2.getMiddle();
        name2.getLast();
        
        System.out.println("The first name entered(First Middle Last): " 
            + name1.firstMiddleLast());
        System.out.println("The second name entered(First Middle Last): " 
            + name2.firstMiddleLast());
        
        System.out.println("The first name entered(Last, Middle First): " 
            + name1.lastFirstMiddle());
        System.out.println("The second name entered(Last, Middle, First): " 
            + name2.lastFirstMiddle());
        
        System.out.println("The initials for the first name entered: " 
            + name1.initials());
        System.out.println("The initials for the second name entered: " 
            + name2.initials());
        
        System.out.println("The length of the first name entered: "
            + name1.length());
        System.out.println("The length of the second name entered: "
            + name2.length());
   
        System.out.println("Are these two names the same: " 
        + name1.firstMiddleLast().equalsIgnoreCase(name2.firstMiddleLast()));
     }
}
