package bsu.comp152.calctuesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calcwindow {
    private int storedNumber;

    @FXML
    private TextField numberDisplay;

    @FXML
    public void numberButtonPushed(ActionEvent event){
        var currentText = numberDisplay.getText();
        var ButtonPressed = (Button)event.getSource();
        var currentNumberText = ButtonPressed.getText();
        var newText = currentText+currentNumberText;
        numberDisplay.setText(newText);
    }

    @FXML
    public void addButtonPressed() {
        var numberText = numberDisplay.getText();
        storedNumber = Integer.parseInt(numberText);
        numberDisplay.clear();
    }

    @FXML
    public void equalButtonPressed(){
        var currentNumberText = numberDisplay.getText();
        var currentNumber = Integer.parseInt(currentNumberText);
        var sum = currentNumber + storedNumber;
        numberDisplay.setText(""+sum);
    }

    @FXML
    public void clearButtonPressed() {
        numberDisplay.setText("");
    }
}
