package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

public class RelaxCharacterInputEvent extends InputEvent {

    public RelaxCharacterInputEvent(){ super("relax", CharacterState.Chilling, 60); }

    protected void inputAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldStress = character.getStress();

        character.decreaseStress();

        int newStress = character.getStress();

        hellscape.logMessage(String.format(
            "Character relaxed. stress went from %d to %d",
            oldStress,
            newStress ));
    }
    
}
