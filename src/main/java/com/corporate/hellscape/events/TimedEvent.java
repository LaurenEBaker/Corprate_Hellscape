package com.corporate.hellscape.events;

import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;


public abstract class TimedEvent extends Event {

    private LocalDateTime eventTime;

    protected TimedEvent() {}

    protected void SetDelay(int delayDurationSeconds, Hellscape hellscape) {
        eventTime = hellscape.getGameTime().plusSeconds(delayDurationSeconds);
    }

    protected TimedEvent(int delayDurationSeconds, Hellscape hellscape) {
        SetDelay(delayDurationSeconds, hellscape);
    }

    public boolean isTriggered(Hellscape hellscape) {
        return eventTime.isBefore(hellscape.getGameTime());
    }
    
}
