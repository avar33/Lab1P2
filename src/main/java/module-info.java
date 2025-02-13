module com.example.lab1p2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab1p2 to javafx.fxml;
    exports com.example.lab1p2;
}