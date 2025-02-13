package com.example.lab1p2;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

abstract public class Intermediate_Char extends Pane implements CharPanel {
    public Intermediate_Char() {
        setPrefSize(400, 300);
        setPanelBackground();
        addCharacter();
        //TODO: add label for each level
    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/inter_char.png").toExternalForm());
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(getPrefWidth(), getPrefHeight()); // sets it within the constraints of the background
        stackPane.getChildren().add(imageView); // add image

        getChildren().add(stackPane);
    }
}
