package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

//NOTE: For issue #7, change this to abstract and create a concrete
//      example child class that implements it (see Hellscape.java)
public class TimedEvent extends Event {

    //TODO: Implement this so that it interacts with isTriggered
    //NOTE: To be used by child classes to set their timeout
    protected TimedEvent(int delayDurationSeconds) {}

    //TODO: This should be removed when implementing #7
    public TimedEvent() { this(0); }

    //TODO: Implement
    public boolean isTriggered(Hellscape hellscape) { return false; }

    //NOTE: For issue #7 remove this from this class and let
    //      concrete implementations of TimedEvent handle the
    //      action themselves
    public void triggerAction(Hellscape hellscape) {}
}
