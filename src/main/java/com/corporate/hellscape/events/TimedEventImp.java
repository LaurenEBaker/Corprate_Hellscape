package com.corporate.hellscape.events;

import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;


public class TimedEventImp extends TimedEvent {

    private long delayDurationSeconds;
    private LocalDateTime eventTime;


    public TimedEventImp(int delayDurationSeconds,Hellscape hellscape) {
        super(delayDurationSeconds, hellscape);
        this.delayDurationSeconds = delayDurationSeconds;
        eventTime = hellscape.getGameTime().plusSeconds(delayDurationSeconds);
    }

    public boolean isTriggered(Hellscape hellscape) {
        LocalDateTime currentTime = hellscape.getGameTime();
        return eventTime.isAfter(currentTime) ;
    }

   

    @Override
    protected void triggerAction(Hellscape hellscape) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'triggerAction'");
    }
}
