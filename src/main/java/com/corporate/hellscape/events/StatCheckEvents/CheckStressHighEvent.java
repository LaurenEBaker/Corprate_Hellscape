package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckStressHighEvent extends StatCheckEvent {

    public CheckStressHighEvent(Hellscape hellscape) { super(30, hellscape); }

    public void statTriggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealth();
    }

    public boolean statIsAtThreshold(Character character) {
        return (character.getStress() > 50);
    }
}
