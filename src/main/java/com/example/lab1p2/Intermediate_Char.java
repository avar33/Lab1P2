package com.example.lab1p2;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

abstract public class Intermediate_Char extends Pane implements CharPanel {
    public Intermediate_Char() {
        setPrefSize(400, 300);
        setPanelBackground();
        addCharacter();
    }
    public void setPanelBackground(){
        setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,null,null)));
    }
    public void addCharacter(){
        ImageView imageView = new ImageView(getClass().getResource("/images/inter_char.png").toExternalForm());
        Text intermediateMode = new Text("intermediate mode");
        intermediateMode.setFont(new Font(50));
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        VBox vbox = new VBox();
        vbox.setPrefSize(getPrefWidth(), getPrefHeight()); // sets it within the constraints of the background
        vbox.getChildren().addAll(intermediateMode, imageView); // add image

        getChildren().add(vbox);
    }
}
