package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.Event;

public class ShowerCharacterInputEvent extends Event {

    public ShowerCharacterInputEvent(){ }

    @Override
    public boolean isTriggered(Hellscape hellscape) {
      return true;
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        int oldHygiene = character.getHygiene();

        hellscape.getCharacter().increaseHygiene();

        int newHygiene = character.getHygiene();

        System.out.println(String.format(
            "Character took a shower. Hygiene went from %d to %d",
            oldHygiene,
            newHygiene ));
    }
    
}
