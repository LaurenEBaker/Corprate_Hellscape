package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

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
