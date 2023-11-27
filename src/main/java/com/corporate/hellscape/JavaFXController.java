package com.corporate.hellscape;

import java.io.IOException;

import com.corporate.hellscape.GuiControls.GameLoop;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.InputEvents.FeedCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.RelaxCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.ShowerCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.SleepCharacterInputEvent;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class JavaFXController{

    private Hellscape _hellscape = new Hellscape();
    private GameLoop _gameLoop = new GameLoop(this, _hellscape);

    @FXML
    public ImageView image;

    @FXML
    public Label dayCountLabel;
    @FXML
    public Label characterStateLabel;

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

    @FXML
    public TextArea messagesTextArea;

    @FXML
    public void initialize(){
        healthBar.setProgress(1.0);
        hungerBar.setProgress(0.0);
        stressBar.setProgress(0.0);
        staminaBar.setProgress(1.0);
        hygieneBar.setProgress(1.0);
        funBar.setProgress(0.5);
        workLoadBar.setProgress(0.5);

        _gameLoop.start();
    }

    public void workButtonClicked(ActionEvent event) throws IOException{
        //Increase workLoadBar
        //Play animation for working
    }

    public void eatButtonClicked(ActionEvent event){

        _hellscape.registerEvent(new FeedCharacterInputEvent());

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

        timeline.setCycleCount(5);
        timeline.play();

        hungerBar.setProgress(hungerProgress);
        hungerProgress -= 0.1;
    }

    public void sleepButtonClicked(ActionEvent event) throws IOException{
        _hellscape.registerEvent(new SleepCharacterInputEvent());
    }

    public void enjoymentButtonClicked(ActionEvent event) throws IOException{
        _hellscape.registerEvent(new RelaxCharacterInputEvent());
    }

    public void cleanButtonClicked(ActionEvent event) throws IOException{
        _hellscape.registerEvent(new ShowerCharacterInputEvent());
    }

    public void saveGameButtonClicked(ActionEvent event) throws IOException{
        //Save game
    }

    public void exitGameButtonClicked(ActionEvent event) throws IOException{
        //Exit game
    }

    public void showLogMessage(String message) {
        messagesTextArea.appendText(message + "\n");
    }

    public void setCharacterStateDisplay(CharacterState characterState) {

        characterStateLabel.setText(String.format(
            "%s is %s",
            _hellscape.getCharacter().getName(),
            characterState.toString() ));
    }
}
