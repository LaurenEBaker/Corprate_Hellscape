package com.corporate.hellscape;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class JavaFXController{
    @FXML
    public ImageView image;

    @FXML
    public Label dayCountLabel;

    @FXML
    public ProgressBar healthBar;
    @FXML
    public ProgressBar hungerBar;
    public double hungerProgress = 1.0;
    @FXML
    public ProgressBar stressBar;
    @FXML
    public ProgressBar staminaBar;
    @FXML
    public ProgressBar hygieneBar;
    @FXML
    public ProgressBar funBar;
    @FXML
    public ProgressBar workLoadBar;

    @FXML
    public MenuButton deStressButton;

    public void workButtonClicked(ActionEvent event) throws IOException{
        //Increase workLoadBar
        //Play animation for working
    }

    public void eatButtonClicked(ActionEvent event){

        //Example Animation
        image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite2.png"));

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite1.png"));
            }
            
        }));
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(200), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite2.png"));
            }
            
        }));

        timeline.setCycleCount(10);
        timeline.play();

        hungerBar.setProgress(hungerProgress);
        hungerProgress -= 0.1;
    }

    public void sleepButtonClicked(ActionEvent event) throws IOException{
        //Increase staminaBar
        //Play animation for sleeping
    }

    public void enjoymentButtonClicked(ActionEvent event) throws IOException{
        //Increase funBar
        //Play animation for enjoyment
    }

    public void cleanButtonClicked(ActionEvent event) throws IOException{
        //Increase hygieneBar
        //Play animation for cleaning
    }

    public void saveGameButtonClicked(ActionEvent event) throws IOException{
        //Save game
    }

    public void exitGameButtonClicked(ActionEvent event) throws IOException{
        //Exit game
    }
}
