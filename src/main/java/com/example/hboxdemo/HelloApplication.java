package com.example.hboxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    int num1=2;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Vbox");
        stage.setScene(scene);
        stage.show();
    }

    public void sayHi(){
        System.out.println("Say Hi");
    }

    public static void main(String[] args) {
        launch();
    }
}