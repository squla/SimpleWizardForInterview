package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 2016-04-11.
 */
public class CardPanel extends JPanel {
    private JLabel label;
    private JTextField field;
    private JPanel content;

    public CardPanel() {
        label = new JLabel("");
        field = new JTextField(20);
        content = new JPanel(new GridBagLayout());
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 300));


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.CENTER;


        content.add(label, gbc);
        gbc.gridy++;
        content.add(field, gbc);


        add(content, BorderLayout.CENTER);
    }

    public JTextField getField() {
        return field;
    }

    public JLabel getLabel() {
        return label;
    }

    public JPanel getContent() {
        return content;
    }
}
