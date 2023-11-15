package com.corporate.hellscape;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JavaFXController{
    @FXML
    public ImageView image;

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

    public void eatButtonClicked(ActionEvent event) throws IOException, InterruptedException {
        for(int i = 0; i < 10; i++){
            image.setImage(new Image("Animations/bite2.png"));
            Thread.sleep(50);
            image.setImage(new Image("Animations/bite1.png"));
            Thread.sleep(50);
        }

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
