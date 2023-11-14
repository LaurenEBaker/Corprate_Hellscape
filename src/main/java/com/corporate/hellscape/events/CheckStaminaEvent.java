package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class CheckStaminaEvent extends TimedEvent {

    public CheckStaminaEvent( Hellscape hellscape) {
        super(30, hellscape);
       
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        character.decreaseStamina();
        hellscape.registerEvent(new CheckStaminaEvent(hellscape));
    }
    
}
