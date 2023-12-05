package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.TimedEvent;

public class AlterHungerEvent extends TimedEvent {

    public AlterHungerEvent( Hellscape hellscape, Character character) {
        super(30, hellscape);
        character = hellscape.getCharacter();

    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();

        if(character.getState() == CharacterState.Eating)
            character.decreaseHunger();
        else
            character.increaseHunger();

        hellscape.registerEvent(new AlterHungerEvent(hellscape, hellscape.getCharacter()));
    }
    
}
