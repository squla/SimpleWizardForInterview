package View;

import Controllers.ButtonController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 2016-04-11.
 */
public class WizardFrame extends JFrame {

    public WizardFrame() throws HeadlessException {
        this.init();
    }

    private void init() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kujbida Michał");
        this.setLayout(new BorderLayout());
        CardPanel cardPanel = new CardPanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        this.add(new TitlePanel(), BorderLayout.NORTH);
        this.add(cardPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        ButtonController buttonController = new ButtonController(buttonPanel, cardPanel);
        this.pack();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
