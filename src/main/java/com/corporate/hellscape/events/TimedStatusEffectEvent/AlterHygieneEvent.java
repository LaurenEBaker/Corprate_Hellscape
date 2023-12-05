package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.TimedEvent;

public class AlterHygieneEvent extends TimedEvent {

    public AlterHygieneEvent(Hellscape hellscape) {
        super(30, hellscape);
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();

        if(character.getState() == CharacterState.Showering)
            character.increaseHygiene();
        else
            character.decreaseHygiene();

        hellscape.registerEvent(new AlterHygieneEvent(hellscape));
    }
    
}
