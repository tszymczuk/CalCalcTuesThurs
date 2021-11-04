package bsu.comp152.calctuesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calcwindow {
    private int storedNumber;
    private OperatorType lastOp;
    @FXML
    private TextField numberDisplay;

    @FXML
    public void numberButtonPushed(ActionEvent event) {
        var currentText = numberDisplay.getText();
        var ButtonPressed = (Button) event.getSource();
        var currentNumberText = ButtonPressed.getText();
        var newText = currentText + currentNumberText;
        numberDisplay.setText(newText);
    }

    @FXML
    public void subtractButtonPressed() {
        var numberText = numberDisplay.getText();
        storedNumber = Integer.parseInt(numberText);
        numberDisplay.clear();
        lastOp = OperatorType.Subtract;
    }

    @FXML
    public void multiplyPressed() {
        var numberText = numberDisplay.getText();
        storedNumber = Integer.parseInt(numberText);
        numberDisplay.clear();
        lastOp = OperatorType.Multiply;
    }

    @FXML
    public void dividePressed() {
        var numberText = numberDisplay.getText();
        storedNumber = Integer.parseInt(numberText);
        numberDisplay.clear();
        lastOp = OperatorType.Divide;
    }

    @FXML
    public void addButtonPressed() {
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
        lastOp = OperatorType.Add;
    }

    @FXML
    public void equalButtonPressed() {
        double result = 0.0;
        var currentNumberText = numberDisplay.getText();
        var currentNumber = Integer.parseInt(currentNumberText);
        switch (lastOp) {
            case Add -> result = currentNumber + storedNumber;
            case Subtract -> result = storedNumber - currentNumber;
            case Multiply -> result = currentNumber * storedNumber;
            case Divide -> result = storedNumber / currentNumber;
        }

        numberDisplay.setText("" + result);
    }

    @FXML
    public void clearButtonPressed() {
        numberDisplay.setText("");
    }
}