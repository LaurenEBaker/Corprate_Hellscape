package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class StatusEventWorkHigh extends StatusEvent{

    public void triggerAction(Hellscape hellscape) {
        hellscape.getCharacter().increaseStress();
    }

    public boolean isTriggered(Character character) {
        if(character.getWorkLoad() > 50)
            return true;
        return false;
    }
}