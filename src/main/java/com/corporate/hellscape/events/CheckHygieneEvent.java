package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class CheckHygieneEvent extends TimedEvent {

    public CheckHygieneEvent(Hellscape hellscape) {
        super(30, hellscape);
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        character.decreaseHygiene();
        hellscape.registerEvent(new CheckHygieneEvent(hellscape));
    }
    
}
