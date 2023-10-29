package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class CheckHungerEvent extends TimedEvent {

    public CheckHungerEvent(int delayDurationSeconds, Hellscape hellscape, Character character) {
        super(30, hellscape);
        character = hellscape.getCharacter();

    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
       Character character = hellscape.getCharacter();
       character.increaseHunger();
       hellscape.registerEvent(this);
    }
    
}
