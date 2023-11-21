package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.Hellscape;

public class SleepCharacterInputEvent extends Event {

    public SleepCharacterInputEvent(){ }
    
    @Override
    public boolean isTriggered(Hellscape hellscape) {
      return true;
    }
    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        int oldStamina = character.getStamina();

        hellscape.getCharacter().increaseStaminaBy(5);

        int newStamina = character.getStamina();

        hellscape.logMessage(String.format(
            "Character got some rest. Stamina went from %d to %d",
            oldStamina,
            newStamina ));
    }
    
}
