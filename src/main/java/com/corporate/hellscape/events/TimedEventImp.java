package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;


public class TimedEventImp extends TimedEvent {

    public TimedEventImp(Hellscape hellscape) {
        super(10, hellscape);
    }

    protected void triggerAction(Hellscape hellscape) {

        throw new UnsupportedOperationException("TimedEventImp triggerd after 10 game seconds");
    }
}