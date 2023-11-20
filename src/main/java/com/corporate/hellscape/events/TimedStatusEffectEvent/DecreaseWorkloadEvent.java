package com.corporate.hellscape.events.TimedStatusEffectEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.TimedEvent;
import com.corporate.hellscape.character.Character;

public class DecreaseWorkloadEvent extends TimedEvent {

    public DecreaseWorkloadEvent(Hellscape hellscape){
        super(30,hellscape);
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        character.decreaseWorkLoad();
        hellscape.registerEvent(new DecreaseWorkloadEvent(hellscape));
    }
    
}
