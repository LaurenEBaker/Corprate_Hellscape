package com.corporate.hellscape;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;

public class JavaFXController {
    public Image image;

    public ProgressBar HealthBar;

    public ProgressBar HungerBar;
    public double HungerProgress = 0.1;

    public ProgressBar StressBar;
    public ProgressBar StaminaBar;
    public ProgressBar HygieneBar;
    public ProgressBar FunBar;
    public ProgressBar WorkLoadBar;

    public Button feedButton;

    public void feedButtonClicked(ActionEvent event) throws IOException {
        HungerBar.setProgress(HungerProgress);
        HungerProgress += 0.1;
    }
}
