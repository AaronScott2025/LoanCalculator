package com.example.jfxloancalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class calculateLoans extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calculateLoans.class.getResource("hello-view.fxml")); //Launch FXML
        Scene scene = new Scene(fxmlLoader.load(), 389, 228); //Load at proper proportions
        stage.setTitle("Aaron's Loan Calculator"); //Title personalized to myself
        stage.setScene(scene); //Set scene
        stage.show(); //Shows the screen
    }

    public static void main(String[] args) {
        launch();
    }
}