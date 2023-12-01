package com.corporate.hellscape;

import java.io.IOException;

import com.corporate.hellscape.GuiControls.GameLoop;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.InputEvents.DelegateCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.FeedCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.RelaxCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.ShowerCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.SleepCharacterInputEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class JavaFXController{

    private Hellscape _hellscape = new Hellscape();
    private GameLoop _gameLoop = new GameLoop(this, _hellscape);
    public int counter;

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
    public TextArea messagesTextArea;
    @FXML
    public Button workButton;
    @FXML
    public Button exitGameButton;

    @FXML
    public void initialize() {
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
        _hellscape.registerEvent(new DelegateCharacterInputEvent());
        counter++;
        if (counter>2) {
            workButton.setDisable(true);
        } 
    }

    public void eatButtonClicked(ActionEvent event){

        _hellscape.registerEvent(new FeedCharacterInputEvent());

        //Example Animation
        // image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite2.png"));

        // Timeline timeline = new Timeline();
        // timeline.getKeyFrames().add(new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handle(ActionEvent event) {
        //         image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite1.png"));
        //     }
            
        // }));
        // timeline.getKeyFrames().add(new KeyFrame(Duration.millis(200), new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handle(ActionEvent event) {
        //         image.setImage(new Image("file:src/main/java/com/corporate/hellscape/Animations/bite2.png"));
        //     }
            
        // }));

        // timeline.setCycleCount(5);
        // timeline.play();
    }

    public void sleepButtonClicked(ActionEvent event) throws IOException {
        _hellscape.registerEvent(new SleepCharacterInputEvent());
    }

    public void enjoymentButtonClicked(ActionEvent event) throws IOException {
        _hellscape.registerEvent(new RelaxCharacterInputEvent());
    }

    public void cleanButtonClicked(ActionEvent event) throws IOException {
        _hellscape.registerEvent(new ShowerCharacterInputEvent());
    }

    public void exitGameButtonClicked(ActionEvent event) throws IOException{
        Stage stage = (Stage) exitGameButton.getScene().getWindow();
        stage.close();
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
