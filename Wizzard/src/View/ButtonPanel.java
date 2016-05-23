package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 2016-04-11.
 */
public class ButtonPanel extends JPanel {
    private JButton prevButton;
    private JButton nextButton;
    private JButton finishButton;
    private JButton cancelButton;

    public ButtonPanel() {
        init();
    }

    private void init() {

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        prevButton = new JButton("Prev");
        nextButton = new JButton("Next");
        finishButton = new JButton("Finish");
        cancelButton = new JButton("Cancel");

        this.setLayout(new BorderLayout());
        this.add(new JSeparator(), BorderLayout.NORTH);

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(finishButton);
        buttonPanel.add(cancelButton);


        this.add(buttonPanel, java.awt.BorderLayout.EAST);


    }

    public JButton getPrevButton() {
        return prevButton;
    }

    public JButton getNextButton() {
        return nextButton;
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
