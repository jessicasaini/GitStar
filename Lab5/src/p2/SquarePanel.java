package p2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Demonstrates the use of graphical objects.
 * 
 * @author Jagjot
 * @version 1
 */
public class SquarePanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 249395L;

    /** First Square. */
    private final Square square1;
    /** Second Square. */
    private final Square square2;
    /** Third Square. */
    private final Square square3;
    /** Fourth Square. */
    private final Square square4;
    /** Fifth Square. */
    private final Square square5;

    /**
     * Constructor: Creates five Square objects.
     */
    public SquarePanel() {
        // width of panel
        final int panelWidth = 600;
        // height of panel
        final int panelHeight = 400;

        square1 = new Square();

        square2 = new Square();

        square3 = new Square();

        square4 = new Square();

        square5 = new Square();

        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.black);
    }

    /**
     * Draws this panel by requesting that each square draw itself.
     * 
     * @param page
     *            The graphic object upon which to draw
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        square1.draw(page);
        square2.draw(page);
        square3.draw(page);
        square4.draw(page);
        square5.draw(page);
    }
}
