package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.ImmediateEvent;
import com.corporate.hellscape.events.ResetStatusEvents.ResetStatusEvent;

public abstract class InputEvent extends ImmediateEvent {

    private String _actionName;
    private CharacterState _targetState;
    private int _stateWaitTime;
    
    protected InputEvent(String actionName, CharacterState targetState, int stateWaitTime) {
        super();

        _targetState = targetState;
        _actionName = actionName;
        _stateWaitTime = stateWaitTime;
    }

    public void triggerAction(Hellscape hellscape) {

        if(hellscape.getCharacter().isBusy()) {

            hellscape.logMessage(String.format(
                "Can't %s right now, %s is busy",
                _actionName,
                hellscape.getCharacter().getName() ));

            return;
        }

        hellscape.getCharacter().setState(_targetState);
        inputAction(hellscape);
        hellscape.registerEvent(new ResetStatusEvent(hellscape, _targetState, _stateWaitTime));
    }

    protected abstract void inputAction(Hellscape hellscape);
}
