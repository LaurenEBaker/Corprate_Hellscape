package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public abstract class ImmediateEvent extends Event {

    public final boolean isTriggered(Hellscape hellscape) { return true; }
}
