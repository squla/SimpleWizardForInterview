package Controllers;

import Repositories.FieldRepository;
import Repositories.FieldRepositoryIMPL;
import View.ButtonPanel;
import View.CardPanel;
import View.FinishPanel;

/**
 * Created by Michal on 2016-04-11.
 */
public class ButtonController {
    private ButtonPanel buttonPanel;
    private CardPanel cardPanel;
    private CardController cardController;
    private FieldRepository fieldRepository;
    private boolean exit;

    public ButtonController(ButtonPanel buttonPanel, CardPanel cardPanel) {

        this.fieldRepository = new FieldRepositoryIMPL();
        this.buttonPanel = buttonPanel;
        this.cardPanel = cardPanel;
        this.cardController = new CardController(this.cardPanel);
        this.exit = false;
        cardController.setLabel(fieldRepository.getCurrent());

        initActionListener();
        refreshStatus();
    }


    private void initActionListener() {
        buttonPanel.getPrevButton().addActionListener(e -> {
            this.onPrevButton();
        });

        buttonPanel.getNextButton().addActionListener(e -> {
            this.onNextButton();
        });

        buttonPanel.getCancelButton().addActionListener(e -> {
            this.onCancelButton();
        });

        buttonPanel.getFinishButton().addActionListener(e -> {
            this.onFinishButon();
        });
    }

    private void onFinishButon() {
        fieldRepository.getCurrent().setValue(cardController.getTextField());
        cardController.swapPanel(new FinishPanel(fieldRepository.getFields()));
        hideButton();
        if (!exit) {
            buttonPanel.getFinishButton().setText("Exit");
            exit = true;
        } else {
            System.exit(0);
        }

    }

    private void onCancelButton() {
        System.exit(0);
    }

    private void onNextButton() {
        fieldRepository.getCurrent().setValue(cardController.getTextField());
        cardController.setLabel(fieldRepository.getNext());
        refreshStatus();
    }

    private void onPrevButton() {
        fieldRepository.getCurrent().setValue(cardController.getTextField());
        cardController.setLabel(fieldRepository.getPrev());
        refreshStatus();
    }


    private void refreshStatus() {
        buttonPanel.getNextButton().setEnabled(fieldRepository.hasNext());
        buttonPanel.getFinishButton().setEnabled(!fieldRepository.hasNext());
        buttonPanel.getPrevButton().setEnabled(fieldRepository.hasPrev());
    }

    private void hideButton() {
        buttonPanel.getNextButton().setEnabled(false);
        buttonPanel.getPrevButton().setEnabled(false);
    }

}
