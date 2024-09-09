module com.example.jfxloancalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxloancalc to javafx.fxml;
    exports com.example.jfxloancalc;
}