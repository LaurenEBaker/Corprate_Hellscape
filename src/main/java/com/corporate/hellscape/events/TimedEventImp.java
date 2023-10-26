package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;


public class TimedEventImp extends TimedEvent {

    public TimedEventImp(Hellscape hellscape) {
        super(10, hellscape);
    }

    protected void triggerAction(Hellscape hellscape) {

        //Using this as an example to show that event retirement is working properly
        System.out.println("This timed event should only trigger once");
    }
}