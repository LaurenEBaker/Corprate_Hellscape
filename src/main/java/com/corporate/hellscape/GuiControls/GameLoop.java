package com.corporate.hellscape.GuiControls;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.JavaFXController;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

import javafx.animation.AnimationTimer;

public class GameLoop extends AnimationTimer {

    private static long SIMULATION_CYCLE_TIME = 100000000;

    private Hellscape _hellscape;
    private long _lastTimestamp = 0;
    private JavaFXController _parentController;

    public GameLoop(JavaFXController parentController, Hellscape hellscape) {
        super();

        _hellscape = hellscape;
        _parentController = parentController;
    }

    public void updateProgressBar(Character slave){

        //Link up stat progress bar here to character stat by dividing with (double)100.
        _parentController.healthBar.setProgress(slave.getHealth()/100.0);
        if (slave.getHealth()<50) {_parentController.healthBar.setStyle( "-fx-accent: red; " +  "-fx-border-color: #c0392b; ");}
        _parentController.hungerBar.setProgress(slave.getHunger()/100.0);
        if (slave.getHunger()>50) {_parentController.hungerBar.setStyle( "-fx-accent: yellow; ");}
        _parentController.stressBar.setProgress(slave.getStress()/100.0);
        if (slave.getStress()>50) {_parentController.stressBar.setStyle( "-fx-accent: yellow; ");}
        _parentController.staminaBar.setProgress(slave.getStamina()/100.0);
        if (slave.getStamina()<50) {_parentController.staminaBar.setStyle( "-fx-accent: yellow; ");}
        _parentController.hygieneBar.setProgress(slave.getHygiene()/100.0);
        if (slave.getHygiene()<50) {_parentController.hygieneBar.setStyle( "-fx-accent: yellow; ");}
        _parentController.funBar.setProgress(slave.getFun()/100.0);
        if (slave.getFun()<50) {_parentController.funBar.setStyle( "-fx-accent: yellow; ");}
        _parentController.workLoadBar.setProgress(slave.getWorkload()/100.0);
        if (slave.getWorkload()>50) {_parentController.workLoadBar.setStyle( "-fx-accent: red; ");}

    }

    public void caseAnimation(Character slave){

        CharacterState  slaveState = slave.getState();
        CharacterState state;

        switch (slaveState) {
            case value:
                
                break;
        
            default:
                break;
        }

    }

    //TODO: Connect the animation base on character state
    public void updateAnimationOnState(Character slave){

        CharacterState currState = slave.getState();

        if(currState != CharacterState.Working){

            //TODO: Set the correct animation base on current state

            // _hellscape.getCharacter();
            _parentController.image.setImage(null);

        }

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

        

        
       
    }
}
