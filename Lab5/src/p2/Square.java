package p2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * The square class.
 * 
 * @author Jessica
 * @version 1.0
 */
public class Square {
    /** The x position of the square. */
    private int x;
    /** The y position of the square. */
    private int y;
    /** The size of the square. */
    private int size;
    /** The colo of the square. */
    private Color color;
    /** Used to genereate Random numbers. */
    private Random generator = new Random();

    /**
     * Constructor for the Square class.
     */
    public Square() {
        
        x = generator.nextInt(600);
        y = generator.nextInt(400);
        size = generator.nextInt(100) + 100;
        color = new Color(generator.nextInt());
    }

    public void draw(Graphics page) {
        page.setColor(color);
        page.fillRect(x, y, size, size);
    }

}
