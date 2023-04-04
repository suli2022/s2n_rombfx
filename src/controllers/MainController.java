package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField sideField;
    @FXML
    private TextField alphaField;
    @FXML
    private TextField perimeterField;
    @FXML
    private TextField areaField;
    
    @FXML
    public void onClickCalcButton(ActionEvent event) {
        startCalculation();
    }

    private void startCalculation() {
        String sideStr = sideField.getText();
        String alphaStr = alphaField.getText();
        double side = Double.parseDouble(sideStr);
        double alpha = Double.parseDouble(alphaStr);
        Double perimeter = calcPerimeter(side);
        Double area = calcArea(side, alpha);
        perimeterField.setText(perimeter.toString());
        areaField.setText(area.toString());
    }
    private double calcPerimeter(double side) {
        return side * 4;
    }
    private double calcArea(double side, double alpha) {
        double rad = alpha * Math.PI / 180;        
        double area = Math.pow(side, 2)* Math.sin(rad);
        return area;
    }
    
}
