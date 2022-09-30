module com.example.hboxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hboxdemo to javafx.fxml;
    exports com.example.hboxdemo;
}