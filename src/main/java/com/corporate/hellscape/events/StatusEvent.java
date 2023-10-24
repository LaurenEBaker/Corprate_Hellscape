package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

//NOTE: For issue #6, change this to abstract and create a concrete
//      example child class that implements it for testing (see Hellscape.java)
public abstract class StatusEvent extends Event {
    //TODO: Implement isTriggered, mark it final, and have it re-dispatch to
    //      an abstract method of StatusEvent that takes *just the character*
    //      as its argument. It's okay if the testing class you make always
    //      returns true or false or something, since the character class
    //      doesn't have any fields yet
    public final boolean isTriggered(Hellscape hellscape) {
        return isTriggered(hellscape.getCharacter());
    }

    public abstract boolean isTriggered(Character character);
}
