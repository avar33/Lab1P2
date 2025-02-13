package com.example.lab1p2;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


abstract public class Advanced_Weapon extends Pane implements WeaponPanel{
    public void setBackground(){
        setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null)));
    }
    public void addWeapon(){
        ImageView imageView = new ImageView(getClass().getResource("/images/adv_weapon.png").toExternalForm());
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        getChildren().add(imageView);
    }
}
