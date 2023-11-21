package com.corporate.GuiControls;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.JavaFXController;

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

        //TODO: Check for game not running no more
        _hellscape.SimulateOnce();

        for(String message : _hellscape.getPendingMessages())
            _parentController.showLogMessage(message);
    }
}
