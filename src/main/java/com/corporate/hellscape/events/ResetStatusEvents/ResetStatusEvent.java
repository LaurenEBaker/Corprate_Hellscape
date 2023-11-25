package com.corporate.hellscape.events.ResetStatusEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.TimedEvent;

public class ResetStatusEvent extends TimedEvent {

    private CharacterState _targetState;
    
    public ResetStatusEvent(Hellscape hellscape, CharacterState targetState, int stateWaitTime) {
        super(stateWaitTime, hellscape);

        _targetState = targetState;
    }

    protected void triggerAction(Hellscape hellscape) {

        hellscape.getCharacter().clearState(_targetState);
        hellscape.logMessage("Back to work!");
    }
}
