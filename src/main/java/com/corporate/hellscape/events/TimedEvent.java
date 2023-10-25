package com.corporate.hellscape.events;

<<<<<<< HEAD

=======
>>>>>>> c00e3b69ee82bc908a0a098699992308b4a98d68
import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

<<<<<<< HEAD
//NOTE: For issue #7, change this to abstract and create a concrete
//      example child class that implements it (see Hellscape.java)
public abstract class TimedEvent extends Event {

    //TODO: Implement this so that it interacts with isTriggered
    //NOTE: To be used by child classes to set their timeout
    protected TimedEvent(long delayDurationSeconds,Hellscape hellscape) {}

    //TODO: Implement
    public boolean isTriggered(Hellscape hellscape, Character character) { return false; }

}
=======
public abstract class TimedEvent extends Event {

    private LocalDateTime eventTime;

    protected TimedEvent(int delayDurationSeconds, Hellscape hellscape) {
        eventTime = hellscape.getGameTime().plusSeconds(delayDurationSeconds);
    }

    public boolean isTriggered(Hellscape hellscape) {
        return eventTime.isBefore(hellscape.getGameTime());
    }
}
>>>>>>> c00e3b69ee82bc908a0a098699992308b4a98d68
