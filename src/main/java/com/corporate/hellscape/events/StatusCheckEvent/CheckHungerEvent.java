package com.corporate.hellscape.events.StatusCheckEvent;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.TimedEvent;

public class CheckHungerEvent extends TimedEvent {
    public CheckHungerEvent(Hellscape hellscape) {
        super(10, hellscape);
    }

    public void triggerAction(Hellscape hellscape) {
        hellscape.registerEvent(new CheckHungerHighEvent());
    }
}
