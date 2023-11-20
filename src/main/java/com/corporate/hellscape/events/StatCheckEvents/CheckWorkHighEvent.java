package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckWorkHighEvent extends StatCheckEvent {

    public CheckWorkHighEvent(Hellscape hellscape) { super(30, hellscape); }

    public void statTriggerAction(Hellscape hellscape) {
        hellscape.getCharacter().increaseStress();
    }

    public boolean statIsAtThreshold(Character character) {
        return (character.getWorkLoad() > 50);
    }
}
