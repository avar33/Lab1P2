package com.example.lab1p2;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

abstract class Advanced_Char extends Pane implements CharPanel {
    public Advanced_Char() {
        setPrefSize(400,300);
        setPanelBackground();
        addCharacter();
    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/adv_char.png").toExternalForm());
        Text advanceMode = new Text("advanced mode");
        advanceMode.setFont(new Font(50));
        imageView.setFitWidth(350);
        imageView.setFitHeight(175);
        VBox vbox = new VBox();
        vbox.setPrefSize(getPrefWidth(), getPrefHeight());
        vbox.getChildren().addAll(advanceMode, imageView);

        getChildren().add(vbox);
    }
}