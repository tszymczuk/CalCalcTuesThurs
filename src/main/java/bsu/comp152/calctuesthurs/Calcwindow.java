package bsu.comp152.calctuesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Calcwindow {
    @FXML
    private TextField numberDisplay;


    @FXML
    public void numberButtonPushed(ActionEvent event){
        var currentText = numberDisplay.getText();
        var currentNumberText = event.getSource().toString();
        var newText = currentText+currentNumberText;
    }
}
