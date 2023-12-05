package com.corporate.hellscape.GuiControls;

import java.util.Map;
import java.util.HashMap;
import java.time.format.DateTimeFormatter;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.JavaFXController;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;


public class GameLoop extends AnimationTimer {

    private static long SIMULATION_CYCLE_TIME = 100000;

    private Hellscape _hellscape;
    private long _lastTimestamp = 0;
    private long _animationTicks = 0;
    private JavaFXController _parentController;

    private Map<CharacterState, Image[]> _aniImages = hashAnimation();

    public GameLoop(JavaFXController parentController, Hellscape hellscape) {
        super();

        _hellscape = hellscape;
        _parentController = parentController;
        
    }

    public void updateProgressBar(Character slave){

        //Link up stat progress bar here to character stat by dividing with (double)100.
        _parentController.healthBar.setProgress(slave.getHealth() / 100.0);
        _parentController.healthBar.setStyle(slave.getHealth() < 50
            ? "-fx-accent: red; -fx-border-color: #c0392b; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(25,255,0); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.hungerBar.setProgress(slave.getHunger() / 100.0);
        _parentController.hungerBar.setStyle(slave.getHunger() > 50
            ? "-fx-accent: yellow; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.stressBar.setProgress(slave.getStress() / 100.0);
        _parentController.stressBar.setStyle(slave.getStress() > 50
            ? "-fx-accent: yellow; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.staminaBar.setProgress(slave.getStamina() / 100.0);
        _parentController.staminaBar.setStyle(slave.getStamina() < 50
            ? "-fx-accent: yellow; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.hygieneBar.setProgress(slave.getHygiene() / 100.0);
        _parentController.hygieneBar.setStyle(slave.getHygiene() < 50
            ? "-fx-accent: yellow; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.funBar.setProgress(slave.getFun() / 100.0);
        _parentController.funBar.setStyle(slave.getFun() < 50
            ? "-fx-accent: yellow; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );

        _parentController.workLoadBar.setProgress(slave.getWorkload() / 100.0);
        _parentController.workLoadBar.setStyle(slave.getWorkload() > 50
            ? "-fx-accent: red; -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);"
            : "-fx-accent:  rgb(0,225,245); -fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);" );
    }

    //Method that create a Concurrent hashmap of animation image object
    private Map<CharacterState, Image[]> hashAnimation(){

        //A hashmap of image object contain animation image with enum orindal as key
        Map<CharacterState, Image[]> aniImages = new HashMap<>();

        //Working
        aniImages.put(CharacterState.Working, new Image[] {
            new Image(getClass().getResource("/Animations/working1.png").toString()), 
            new Image(getClass().getResource("/Animations/working2.png").toString()) });

        //Sleeping
        aniImages.put(CharacterState.Sleeping, new Image[] {
            new Image(getClass().getResource("/Animations/sleep1.png").toString()), 
            new Image(getClass().getResource("/Animations/sleep2.png").toString()) });

        //Showering
        aniImages.put(CharacterState.Showering, new Image[] {
            new Image(getClass().getResource("/Animations/cleaning1.png").toString()), 
            new Image(getClass().getResource("/Animations/cleaning2.png").toString()) });

        //Eating
        aniImages.put(CharacterState.Eating, new Image[] {
            new Image(getClass().getResource("/Animations/bite1.png").toString()), 
            new Image(getClass().getResource("/Animations/bite2.png").toString()) });

        //Chilling
        aniImages.put(CharacterState.Chilling, new Image[] {
            new Image(getClass().getResource("/Animations/reading1.png").toString()), 
            new Image(getClass().getResource("/Animations/reading2.png").toString()) });

        //Praying
        aniImages.put(CharacterState.Praying, new Image[] {
            new Image(getClass().getResource("/Animations/praying1.png").toString()), 
            new Image(getClass().getResource("/Animations/praying2.png").toString()) });

        //Delegate
        aniImages.put(CharacterState.Delegate, new Image[] {
            new Image(getClass().getResource("/Animations/standing1.png").toString()), 
            new Image(getClass().getResource("/Animations/standing2.png").toString()) });

        //Dead
        aniImages.put(CharacterState.Dead, new Image[] {
            new Image(getClass().getResource("/Animations/dead.png").toString()), 
            new Image(getClass().getResource("/Animations/dead.png").toString()) });
        
        return aniImages;
    }

    //Method to Connect the animation base on character state
    public void updateAnimationOnState(Character slave){
        _parentController.image.setImage(
            _aniImages.get(slave.getState())[
                _animationTicks >= 45 ? 1 : 0 ] );
    }

    public void handle(long now) {

        //Only run a simulation pass if enough real-world time has passed
        if(!(_lastTimestamp == 0 || _lastTimestamp + SIMULATION_CYCLE_TIME <= now)) 
            return;

        _animationTicks = (_animationTicks + 1) % 90;
        _lastTimestamp = now;
        _hellscape.SimulateOnce();
        _parentController.setCharacterStateDisplay(_hellscape.getCharacter().getState());

        for(String message : _hellscape.getPendingMessages())
            _parentController.showLogMessage(message);

        updateProgressBar(_hellscape.getCharacter());
        updateAnimationOnState(_hellscape.getCharacter());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd HH:mm:ss");
        String formattedDateTime = _hellscape.getGameTime().format(formatter);
        _parentController.dayCountLabel.setText("Day "+formattedDateTime);

        //Stop the simulation
        if(!_hellscape.getGameRunning())
            stop();

    }
}

