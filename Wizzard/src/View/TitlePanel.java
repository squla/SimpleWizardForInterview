package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 2016-04-11.
 */
public class TitlePanel extends JPanel {
    public TitlePanel() {
        this.init();
    }

    private void init(){
        setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("Wizard for PGS Software", SwingConstants.CENTER);
        jLabel.setFont(new Font(jLabel.getFont().getName(), jLabel.getFont().getStyle(), 20));
        add(jLabel, BorderLayout.NORTH);
        add(new JSeparator(), BorderLayout.CENTER);
    }
}
