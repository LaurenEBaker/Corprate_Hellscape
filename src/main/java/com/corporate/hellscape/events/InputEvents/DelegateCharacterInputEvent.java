package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.CharacterState;
import com.corporate.hellscape.character.Character;

public class DelegateCharacterInputEvent extends InputEvent {

    public DelegateCharacterInputEvent() { super("Delegate", CharacterState.Delegate, 60); }

    @Override
    protected void inputAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        int oldWorkload = character.getWorkload();

        character.decreaseWorkloadBy(50);

        int newWorkload = character.getWorkload();

        hellscape.logMessage(String.format(
            "Character delegated some of his duties workload went from %d to %d",
            oldWorkload,
            newWorkload ));
    }
    
}
