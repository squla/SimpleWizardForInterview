package View;

import Model.Field;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Michal on 2016-04-11.
 */
public class FinishPanel extends JPanel {
    private List<Field> fields;

    public FinishPanel(List<Field> fields) {
        this.fields = fields;
        this.init();
    }

    private void init() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 300));

        JPanel content = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(8, 80, 8, 80);
        gbc.anchor = GridBagConstraints.WEST;

        fields.forEach((item) -> {
                    JLabel jLabel = new JLabel(item.getName());
                    jLabel.setFont(new Font(jLabel.getFont().getName(), jLabel.getFont().getStyle(), 15));
                    content.add(jLabel, gbc);
                    gbc.gridx++;

                    jLabel = new JLabel(item.getValue());
                    jLabel.setFont(new Font(jLabel.getFont().getName(), jLabel.getFont().getStyle(), 15));
                    content.add(jLabel, gbc);
                    gbc.gridx--;

                    gbc.gridy++;
                }
        );

        add(new JScrollPane(content));
    }

}
