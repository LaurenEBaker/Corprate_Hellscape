package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

//NOTE: For issue #7, change this to abstract and create a concrete
//      example child class that implements it (see Hellscape.java)
public abstract class TimedEvent extends Event {

    //TODO: Implement this so that it interacts with isTriggered
    //NOTE: To be used by child classes to set their timeout
    protected TimedEvent(int delayDurationSeconds) {}

    public TimedEvent(){
        
    }

    //TODO: Implement
    public boolean isTriggered(Hellscape hellscape, Character character) { return false; }


}
