package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

public class ShowerCharacterInputEvent extends InputEvent {

    public ShowerCharacterInputEvent(){ super("shower", CharacterState.Showering, 60); }

    protected void inputAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldHygiene = character.getHygiene();

        hellscape.getCharacter().increaseHygieneBy(5);

        int newHygiene = character.getHygiene();

        hellscape.logMessage(String.format(
            "Character took a shower. Hygiene went from %d to %d",
            oldHygiene,
            newHygiene ));
    }
    
}
