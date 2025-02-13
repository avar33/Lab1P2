package com.example.lab1p2;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

abstract public class Intermediate_Weapon extends Pane implements WeaponPanel{
    public Intermediate_Weapon(){
        setPrefSize(400, 300);
        setPanelBackground();
        addWeapon();
    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
    }
    public void addWeapon(){
        ImageView imageView = new ImageView(getClass().getResource("/images/inter_weapon.png").toExternalForm());
        imageView.setFitWidth(350);
        imageView.setFitHeight(175);
        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(getPrefWidth(), getPrefHeight()); // sets it within the constraints of the background
        stackPane.getChildren().add(imageView); // add image

        getChildren().add(stackPane);
    }
}
