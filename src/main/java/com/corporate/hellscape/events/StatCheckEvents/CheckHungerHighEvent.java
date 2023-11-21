package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckHungerHighEvent extends StatCheckEvent {

    public CheckHungerHighEvent(Hellscape hellscape) { super(30, hellscape); }

    public void statTriggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealthBy(3);
    }

    public boolean statIsAtThreshold(Character character) {
        return (character.getHunger() > 50);
    }
}
