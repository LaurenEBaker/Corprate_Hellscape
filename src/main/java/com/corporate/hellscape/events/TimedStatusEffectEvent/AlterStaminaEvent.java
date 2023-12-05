package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.events.TimedEvent;

public class AlterStaminaEvent extends TimedEvent {

    public AlterStaminaEvent( Hellscape hellscape) {
        super(30, hellscape);
       
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();

        if(character.getState() == CharacterState.Sleeping)
            character.increaseStamina();
        else
            character.decreaseStamina();

        hellscape.registerEvent(new AlterStaminaEvent(hellscape));
    }
    
}
