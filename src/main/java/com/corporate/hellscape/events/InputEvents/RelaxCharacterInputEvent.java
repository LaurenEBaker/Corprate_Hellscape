package com.corporate.hellscape.events.InputEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.Event;

public class RelaxCharacterInputEvent extends Event {

    public RelaxCharacterInputEvent(){ }

    @Override
    public boolean isTriggered(Hellscape hellscape) {
      return true;
    }

    @Override
    protected void triggerAction(Hellscape hellscape) {
        Character character = hellscape.getCharacter();
        int oldStress = character.getStress();

        hellscape.getCharacter().decreaseStress();

        int newStress = character.getStress();

        System.out.println(String.format(
            "Character relaxed. stress went from %d to %d",
            oldStress,
            newStress ));
    }
    
}
