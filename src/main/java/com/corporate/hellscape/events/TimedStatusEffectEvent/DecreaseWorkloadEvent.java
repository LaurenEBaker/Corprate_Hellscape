package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.TimedEvent;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

public class DecreaseWorkloadEvent extends TimedEvent {

    public DecreaseWorkloadEvent(Hellscape hellscape){
        super(30,hellscape);
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();

        if(character.getState() == CharacterState.Working)
            character.decreaseWorkload();

        hellscape.registerEvent(new DecreaseWorkloadEvent(hellscape));
    }
    
}
