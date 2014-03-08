package p2;

import javax.swing.JFrame;

/**
 * Draws a panel with Squares using graphical objects that draw themselves.
 * 
 * @author Jagjot
 * @version 1
 */
public class DrawSquares {
    /**
     * Presents a collection of circles.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SquarePanel());

        frame.pack();
        frame.setVisible(true);
    }
}
