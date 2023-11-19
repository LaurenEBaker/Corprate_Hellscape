package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.TimedEvent;

public class DecreaseHygeneEvent extends TimedEvent {

    public DecreaseHygeneEvent(Hellscape hellscape) {
        super(30, hellscape);
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        character.decreaseHygiene();
        hellscape.registerEvent(new DecreaseHygeneEvent(hellscape));
    }
    
}
