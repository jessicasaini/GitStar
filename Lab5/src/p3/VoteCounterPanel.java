package p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class counts votes for Joe and Sam.
 * 
 * @author Jessica
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel {
    /** Version of this panel. */
    private static final long serialVersionUID = 132553L;
    /** The number of votes for Joe. */
    private int votesForJoe;
    /** The number of votes for Sam. */
    private int votesForSam;
    /** Button for Joe. */
    private JButton joe;
    /** Button for Sam. */
    private JButton sam;
    /** Label for Joe. */
    private JLabel labelJoe;
    /** Label for Sam. */
    private JLabel labelSam;

    /**
     * Sets up GUI.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;

        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");

        joe.addActionListener(new JoeButtonListener());
        sam.addActionListener(new SamButtonListener());

        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);

        add(joe);
        add(sam);

        add(labelJoe);
        add(labelSam);

        setPreferredSize(new Dimension(600, 40));
        setBackground(Color.cyan);
    }

    /**
     * Listener for button push.
     */
    private class JoeButtonListener implements ActionListener {
        /**
         * Updates counter and label when button is pushed.
         * 
         * @param event
         */
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }

    /**
     * Listener for button push.
     */
    private class SamButtonListener implements ActionListener {
        /**
         * Updates counter and label when button is pushed.
         * 
         * @param event
         */
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}
