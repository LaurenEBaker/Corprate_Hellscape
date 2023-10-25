package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public abstract class Event {
    
    public void process(Hellscape hellscape) {

        if(!isTriggered(hellscape))
            return;

        triggerAction(hellscape);
    }

    public abstract boolean isTriggered(Hellscape hellscape);
    protected abstract void triggerAction(Hellscape hellscape);
}