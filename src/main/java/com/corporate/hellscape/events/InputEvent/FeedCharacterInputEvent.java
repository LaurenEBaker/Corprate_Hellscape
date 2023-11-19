package com.corporate.hellscape.events.InputEvent;

import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class FeedCharacterInputEvent extends Event {

    public FeedCharacterInputEvent() { }
    public boolean isTriggered(Hellscape hellscape) { return true; }

    protected void triggerAction(Hellscape hellscape) {

        Character character = hellscape.getCharacter();
        int oldHunger = character.getHunger();

        hellscape.getCharacter().decreaseHunger();

        int newHunger = character.getHunger();

        System.out.println(String.format(
            "Character was fed. Hunger went from %d to %d",
            oldHunger,
            newHunger ));
    }
}
