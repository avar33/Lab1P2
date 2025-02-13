package com.example.lab1p2;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

abstract class Beginner_Char extends Pane implements CharPanel{
    public void setBackground(){
        setBackground(new Background(new BackgroundFill(Color.LIGHTPINK,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/beginner_char.png").toExternalForm());
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        getChildren().add(imageView);
    }
}
