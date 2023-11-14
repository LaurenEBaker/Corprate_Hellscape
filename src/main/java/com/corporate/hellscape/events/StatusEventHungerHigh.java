package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class StatusEventHungerHigh extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().decreaseHealth();
    }

    public boolean isTriggered(Character character) {
        return (character.getHunger() > 50);
    }
}
