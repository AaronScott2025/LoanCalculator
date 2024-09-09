package com.example.jfxloancalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField AIR; //Annual Interest Rate

    @FXML
    private TextField La; //Loan Amount

    @FXML
    private TextField Mp; //Monthly Payment

    @FXML
    private TextField Ny; //Number Of Years

    @FXML
    private TextField Tp; //Total Payment

    @FXML
    private Button btnCalc; //Button

    @FXML
    private Label errorlbl; //Displays error in calculatePrice

    /**
     * @FXML
     * @param event
     * Calculateprice
     * Uses the user input of Annual Interest Rate, Number of Years, and Loan Amount in order to calculate Monthly Payment, and Total
     * Uses an error label, that only becomes visible if the user input is NOT a numerical value. (Not in Requirements, but just a
     * habit of mine in my other projects.
     */
    @FXML
    void calculatePrice(ActionEvent event) {
        errorlbl.setVisible(false);
        double amount;
        double rate;
        double years;
        try { //Input MUST be numeric.
            rate = Double.parseDouble(AIR.getText());
            years = Double.parseDouble(Ny.getText());
            amount = Double.parseDouble(La.getText());
            double monthlyRate = rate / 12.0 / 100; // div 12 for months, and 100 for percentage
            double loanTerm = years * 12; //Monthly payments, so years * 12
            double monthly = (amount * monthlyRate * Math.pow((1.0+monthlyRate),loanTerm) / (Math.pow((1.0+monthlyRate),loanTerm) - 1.0));
            Mp.setText(Double.toString(monthly)); //Monthly Payment
            Tp.setText(Double.toString(monthly*loanTerm)); //Total Payment (monthly payment times every month
        } catch (NumberFormatException e) { //Not a numeric input. Displays error message underneath the Total Payment lbl.
            errorlbl.setVisible(true); //Error msg
        }
    }

}
