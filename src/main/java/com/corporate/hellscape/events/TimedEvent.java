package com.corporate.hellscape.events;

import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public abstract class TimedEvent extends Event {

    private LocalDateTime eventTime;
    private LocalDateTime starTime;

    protected TimedEvent(int delayDurationSeconds, Hellscape hellscape) {
        eventTime = hellscape.getGameTime().plusSeconds(delayDurationSeconds);
        starTime = hellscape.getGameTime();
    }

    public boolean isTriggered(Hellscape hellscape) {
        return eventTime.isBefore(hellscape.getGameTime());
    }

    public void checkHunger(Hellscape hellscape, Character character) {
        LocalDateTime currenTime = hellscape.getGameTime();
        if (currenTime.getSecond()-starTime.getSecond()==30){
            character.increaseHunger();
        }
    }
}
