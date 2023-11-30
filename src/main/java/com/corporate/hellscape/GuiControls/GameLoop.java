package com.corporate.hellscape.GuiControls;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javafx.util.Duration;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.JavaFXController;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;


public class GameLoop extends AnimationTimer {

    private static long SIMULATION_CYCLE_TIME = 100000000;

    private Hellscape _hellscape;
    private long _lastTimestamp = 0;
    private JavaFXController _parentController;

    private Map<Integer, Image[]> aniImages = hashAnimation();
    private Timeline timeline = new Timeline();

    public GameLoop(JavaFXController parentController, Hellscape hellscape) {
        super();

        _hellscape = hellscape;
        _parentController = parentController;
        
    }

    public void updateProgressBar(Character slave){

        //Link up stat progress bar here to character stat by dividing with (double)100.
        _parentController.healthBar.setProgress(slave.getHealth()/100.0);
        if (slave.getHealth()<50) {_parentController.healthBar.setStyle( "-fx-accent: red; " +  "-fx-border-color: #c0392b; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.hungerBar.setProgress(slave.getHunger()/100.0);
        if (slave.getHunger()>50) {_parentController.hungerBar.setStyle( "-fx-accent: yellow; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.stressBar.setProgress(slave.getStress()/100.0);
        if (slave.getStress()>50) {_parentController.stressBar.setStyle( "-fx-accent: yellow; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.staminaBar.setProgress(slave.getStamina()/100.0);
        if (slave.getStamina()<50) {_parentController.staminaBar.setStyle( "-fx-accent: yellow; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.hygieneBar.setProgress(slave.getHygiene()/100.0);
        if (slave.getHygiene()<50) {_parentController.hygieneBar.setStyle( "-fx-accent: yellow; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.funBar.setProgress(slave.getFun()/100.0);
        if (slave.getFun()<50) {_parentController.funBar.setStyle( "-fx-accent: yellow; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}
        _parentController.workLoadBar.setProgress(slave.getWorkload()/100.0);
        if (slave.getWorkload()>50) {_parentController.workLoadBar.setStyle( "-fx-accent: red; " + "-fx-control-inner-background: rgb(50,50,50); -fx-text-box-border: rgb(30,30,30);");}

    }

    //Method that create a Concurrent hashmap of animation image object
    private Map<Integer, Image[]> hashAnimation(){

        //A hashmap of image object contain animation image with enum orindal as key
        aniImages = new ConcurrentHashMap<>() ;

        //Working
        aniImages.put(CharacterState.Working.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/working1.png").toString()), 
            new Image(getClass().getResource("/Animations/working2.png").toString())});

        //Sleeping
        aniImages.put(CharacterState.Sleeping.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/sleep1.png").toString()), 
            new Image(getClass().getResource("/Animations/sleep2.png").toString())});

        //Showering
        aniImages.put(CharacterState.Showering.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/cleaning1.png").toString()), 
            new Image(getClass().getResource("/Animations/cleaning2.png").toString())});

        //Eating
        aniImages.put(CharacterState.Eating.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/bite1.png").toString()), 
            new Image(getClass().getResource("/Animations/bite2.png").toString())});

        //Chilling
        aniImages.put(CharacterState.Chilling.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/reading1.png").toString()), 
            new Image(getClass().getResource("/Animations/reading2.png").toString())});

        //Praying
        aniImages.put(CharacterState.Praying.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/praying1.png").toString()), 
            new Image(getClass().getResource("/Animations/praying2.png").toString())});

        //Delegate
        aniImages.put(CharacterState.Delegate.ordinal(), new Image[]{new Image(getClass().getResource("/Animations/standing1.png").toString()), 
            new Image(getClass().getResource("/Animations/standing2.png").toString())});
        
        
        return aniImages;

    }

    //Method to Connect the animation base on character state
    public void updateAnimationOnState(Character slave){

        CharacterState currState = slave.getState();

        //Amount of time to run animation frame
        int aniTime = 200;    
        _parentController.image.setImage(aniImages.get(currState.ordinal())[1]);
        
        

        // System.out.println("1st frame");
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(aniTime), e ->{
            _parentController.image.setImage(aniImages.get(currState.ordinal())[1]);
        }));

        timeline.setDelay(Duration.millis(100));

        // System.out.println("2nd frame");
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(aniTime + 100), e ->{
            _parentController.image.setImage(aniImages.get(currState.ordinal())[0]);
        }));

        timeline.setCycleCount(3);
        timeline.play();

        

    }

    public void handle(long now) {

        //Only run a simulation pass if enough real-world time has passed
        if(!(_lastTimestamp == 0 || _lastTimestamp + SIMULATION_CYCLE_TIME <= now)) 
            return;

        _lastTimestamp = now;

        //TODO: Check for game not running no more

        
        _hellscape.SimulateOnce();

        
        _parentController.setCharacterStateDisplay(_hellscape.getCharacter().getState());

        for(String message : _hellscape.getPendingMessages())
            _parentController.showLogMessage(message);

        updateProgressBar(_hellscape.getCharacter());

        updateAnimationOnState(_hellscape.getCharacter());
        timeline.setOnFinished(e -> _hellscape.SimulateOnce());
        

            
    }
        

        

       

       

        

        
       
}

