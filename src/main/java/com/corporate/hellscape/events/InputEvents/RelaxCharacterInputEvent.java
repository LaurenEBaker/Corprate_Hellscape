package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

public class RelaxCharacterInputEvent extends InputEvent {

    public RelaxCharacterInputEvent(){ super("relax", CharacterState.Chilling, 45); }

    protected void inputAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldFun = character.getFun();

        character.increaseFunBy(5);

        int newFun = character.getFun();

        hellscape.logMessage(String.format(
            "Character relaxed. fun went from %d to %d",
            oldFun,
            newFun ));
    }
    
}
