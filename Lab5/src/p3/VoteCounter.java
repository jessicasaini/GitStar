package p3;
import javax.swing.JFrame;

/**
 * Creates the main frame for the program..
 * 
 * @author Jessica
 * @version 1.0
 */
public class VoteCounter {
    /**
     * The main method.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
