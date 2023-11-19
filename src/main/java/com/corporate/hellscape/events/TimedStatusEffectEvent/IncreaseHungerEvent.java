package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.TimedEvent;

public class IncreaseHungerEvent extends TimedEvent {

    public IncreaseHungerEvent( Hellscape hellscape, Character character) {
        super(30, hellscape);
        character = hellscape.getCharacter();

    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
       Character character = hellscape.getCharacter();
       character.increaseHunger();
       hellscape.registerEvent(new IncreaseHungerEvent(hellscape, hellscape.getCharacter()));
    }
    
}
