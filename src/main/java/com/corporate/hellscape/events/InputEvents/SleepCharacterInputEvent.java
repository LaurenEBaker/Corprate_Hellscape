package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.Hellscape;

public class SleepCharacterInputEvent extends InputEvent {

    public SleepCharacterInputEvent() { super("sleep", CharacterState.Sleeping, 60); }

    protected void inputAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldStamina = character.getStamina();

        character.increaseStamina();

        int newStamina = character.getStamina();

        hellscape.logMessage(String.format(
            "Character got some rest. Stamina went from %d to %d",
            oldStamina,
            newStamina ));
    }
    
}
