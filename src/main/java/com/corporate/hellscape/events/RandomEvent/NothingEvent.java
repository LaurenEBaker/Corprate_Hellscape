package com.corporate.hellscape.events.RandomEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class NothingEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        System.out.println("Nothing eventful happened");
    }
}
