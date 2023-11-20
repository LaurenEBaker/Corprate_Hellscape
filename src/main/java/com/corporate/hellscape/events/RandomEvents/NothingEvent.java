package com.corporate.hellscape.events.RandomEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class NothingEvent extends ImmediateEvent {

    public void triggerAction(Hellscape hellscape) {
        hellscape.logMessage("Nothing eventful happened");
    }
}
