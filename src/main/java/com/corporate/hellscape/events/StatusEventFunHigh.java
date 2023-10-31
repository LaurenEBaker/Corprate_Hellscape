package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class StatusEventFunHigh extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseStress();
    }

    public boolean isTriggered(Character character) {
        return (character.getFun() > 50);
    }
}
