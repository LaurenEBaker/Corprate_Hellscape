package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.character.CharacterState;

public class FeedCharacterInputEvent extends InputEvent {

    public FeedCharacterInputEvent() { super("eat", CharacterState.Eating, 60); }

    protected void inputAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldHunger = character.getHunger();

        character.decreaseHunger();

        int newHunger = character.getHunger();

        hellscape.logMessage(String.format(
            "Character was fed. Hunger went from %d to %d",
            oldHunger,
            newHunger ));
    }
}
