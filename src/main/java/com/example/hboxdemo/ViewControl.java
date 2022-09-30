package com.example.hboxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewControl implements Initializable {

    private final ArrayList<Button> buttonArrayList = new ArrayList<>(10);
    @FXML
    public Button btn1;
    @FXML
    public HBox root;
    int btnCtr = 0;
    private HelloApplication helloApplication = new HelloApplication();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        root.setSpacing(10);
    }

    public void addRadio(ActionEvent actionEvent) {
        root.setMaxWidth(200);
        btnCtr++;
        if (btnCtr <= 10) {
            String btnName = "Radio " + btnCtr;
            Button button = new Button(btnName);
            root.getChildren().add(button);
        }

        helloApplication.sayHi();


    }
}
