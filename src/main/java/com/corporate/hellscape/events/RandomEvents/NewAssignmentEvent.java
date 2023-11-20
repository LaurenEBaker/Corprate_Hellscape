package com.corporate.hellscape.events.RandomEvents;

import java.io.Console;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class NewAssignmentEvent extends ImmediateEvent {

    protected void triggerAction(Hellscape hellscape) {
        hellscape.logMessage("Boss: 'Hey, I need this work done ASAP!' (workload up)");
        hellscape.getCharacter().increaseWorkloadBy(15);
    }
}
