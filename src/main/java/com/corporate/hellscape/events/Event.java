package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public abstract class Event {

    private boolean _isRetired = false;
    
    public void process(Hellscape hellscape) {

        if(!isTriggered(hellscape))
            return;

        triggerAction(hellscape);
        _isRetired = true;
    }

    public abstract boolean isTriggered(Hellscape hellscape);
    protected abstract void triggerAction(Hellscape hellscape);
    
    public boolean isRetired() {

        return _isRetired;
    }
}
