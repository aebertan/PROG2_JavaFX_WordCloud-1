package ch.zhaw.prog2.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class MainWindowController {

    @FXML
    private Label LabelTitle;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    @FXML
    void hinzufuegenText(ActionEvent event) {
        textEingabe.setText(textEingabe.getText());
        textHistory.setText(textHistory.getText()+textEingabe.getText()+System.lineSeparator());
    }


    @FXML
    void leerenTextEingabe(ActionEvent event) {
        textEingabe.clear();
    }

    void connectProperties(){
        LabelTitle.textProperty().bind(textEingabe.textProperty());

    }

}

