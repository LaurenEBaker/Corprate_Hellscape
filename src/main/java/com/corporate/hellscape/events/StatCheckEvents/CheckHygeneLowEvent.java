package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckHygeneLowEvent extends StatCheckEvent {

    public CheckHygeneLowEvent(Hellscape hellscape) { super(150, hellscape); }

    public void statTriggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealthBy(1);
    }

    public boolean statIsAtThreshold(Character character) {
        return (character.getHygiene() < 50);
    }
}
