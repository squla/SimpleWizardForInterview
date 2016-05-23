package Controllers;

import Model.Field;
import View.CardPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 2016-04-11.
 */
public class CardController {
    private CardPanel cardPanel;

    public CardController(CardPanel cardPanel) {
        this.cardPanel = cardPanel;
    }

    public void setLabel(Field field) {
        cardPanel.getLabel().setText(field.getName());
        cardPanel.getField().setText(field.getValue());

    }

    public String getTextField() {
        return cardPanel.getField().getText();
    }

    public void swapPanel(JPanel newPanel) {
        cardPanel.remove(cardPanel.getContent());
        cardPanel.add(newPanel, BorderLayout.CENTER);
        cardPanel.repaint();
        cardPanel.revalidate();
    }
}
