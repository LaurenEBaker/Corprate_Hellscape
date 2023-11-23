package com.corporate.GuiControls;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.JavaFXController;
import com.corporate.hellscape.character.Character;

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

    public void handle(long now) {

        //Only run a simulation pass if enough real-world time has passed
        if(!(_lastTimestamp == 0 || _lastTimestamp + SIMULATION_CYCLE_TIME <= now)) 
            return;

        _lastTimestamp = now;

        Character slave = _hellscape.getCharacter();

        
    

        //TODO: Check for game not running no more
        _hellscape.SimulateOnce();

        for(String message : _hellscape.getPendingMessages())
            _parentController.showLogMessage(message);

        //TODO: Link up stat progress bar here
        _parentController.healthBar.setProgress(slave.getHealth()/100.0);
        _parentController.hungerBar.setProgress(slave.getHunger()/100.0);
        _parentController.stressBar.setProgress(slave.getStress()/100.0);
        _parentController.staminaBar.setProgress(slave.getStamina()/100.0);
        _parentController.hygieneBar.setProgress(slave.getHygiene()/100.0);
        _parentController.funBar.setProgress(slave.getFun()/100.0);
        _parentController.workLoadBar.setProgress(slave.getWorkload()/100.0);

       //Debug Section
    //    _parentController.showLogMessage(String.valueOf(slave.getHealth()/100.0));

        
       
    }
}
