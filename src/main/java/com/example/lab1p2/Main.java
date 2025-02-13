package com.example.lab1p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        GUIGameFactoryIF begFactory = new BeginnerFactory(); // beginner factory
        GUIGameFactoryIF interFactory = new IntermediateFactory(); // intermediate factory
        GUIGameFactoryIF advFactory = new AdvancedFactory(); // advanced factory

        // CHAR AND WEAPON PANELS FOR EACH LEVEL
        //beginner panels
        CharPanel begCharPanel = begFactory.createCharPanel();
        WeaponPanel begWeaponPanel = begFactory.createWeaponPanel();
        // intermediate panels
        CharPanel interCharPanel = interFactory.createCharPanel();
        WeaponPanel interWeaponPanel = interFactory.createWeaponPanel();
        // advanced panels
        CharPanel advCharPanel = advFactory.createCharPanel();
        WeaponPanel advWeaponPanel = advFactory.createWeaponPanel();

        //VERTICAL BOX CONTAINERS FOR EACH LEVEL
        //beginner
        VBox begContainer = new VBox();
        begContainer.getChildren().addAll((javafx.scene.Node) begCharPanel, (javafx.scene.Node) begWeaponPanel);
        //intermediate
        VBox interContainer = new VBox();
        interContainer.getChildren().addAll((javafx.scene.Node) interCharPanel, (javafx.scene.Node) interWeaponPanel);
        //advanced
        VBox advContainer = new VBox();
        advContainer.getChildren().addAll((javafx.scene.Node) advCharPanel, (javafx.scene.Node) advWeaponPanel); // both panels held in advContainer

        //HORIZONTAL BOX TO HOLD LEVELS SEQUENTIALLY
        HBox levelsContainer = new HBox();
        levelsContainer.getChildren().addAll(begContainer, interContainer, advContainer);

        Scene scene = new Scene(levelsContainer, 1200, 600);
        stage.setScene(scene);
        stage.setTitle("Character and Weapon Selection");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}