package com.example.lab1p2;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

abstract class Advanced_Char extends Pane implements CharPanel {
    public Advanced_Char() {
        setPrefSize(400,300);
        setPanelBackground();
        addCharacter();
        //TODO: add label for each level
    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/adv_char.png").toExternalForm());
        imageView.setFitWidth(350);
        imageView.setFitHeight(175);
        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(getPrefWidth(), getPrefHeight());
        stackPane.getChildren().add(imageView);

        getChildren().add(stackPane);
    }
}