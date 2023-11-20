package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckFunHighEvent extends StatCheckEvent {

    public CheckFunHighEvent(Hellscape hellscape) { super(30, hellscape); }

    protected void statTriggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseStress();
    }

    protected boolean statIsAtThreshold(Character character) {
        return (character.getFun() > 50);
    }
}
