package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public abstract class StatusEvent extends Event {

    public final boolean isTriggered(Hellscape hellscape) {
        return isTriggered(hellscape.getCharacter());
    }

    public abstract boolean isTriggered(Character character);
}
