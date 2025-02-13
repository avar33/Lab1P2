package com.example.lab1p2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        GUIGameFactoryIF advFactory = new AdvancedFactory(); // advanced factory

        // advanced panels
        CharPanel advCharPanel = advFactory.createCharPanel();
        WeaponPanel advWeaponPanel = advFactory.createWeaponPanel();

        //stack containers will hold all panels
        StackPane advContainer = new StackPane();
        advContainer.setId("advContainer");
        advContainer.getChildren().addAll((javafx.scene.Node) advCharPanel, (javafx.scene.Node) advWeaponPanel); // both panels held in advContainer

        Scene scene = new Scene(advContainer, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Advanced");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}