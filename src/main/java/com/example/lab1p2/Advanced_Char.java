package com.example.lab1p2;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

abstract class Advanced_Char extends Pane implements CharPanel {
    public Advanced_Char() {
        setPrefSize(400,300);
        setPanelBackground();
        addCharacter();

    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.DEEPPINK,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/adv_char.png").toExternalForm());
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        getChildren().add(imageView);
    }
}