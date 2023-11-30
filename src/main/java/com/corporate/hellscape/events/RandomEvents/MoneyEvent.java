package com.corporate.hellscape.events.RandomEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.events.ImmediateEvent;

public class MoneyEvent extends ImmediateEvent {

    @Override
    protected void triggerAction(Hellscape hellscape) {
        hellscape.logMessage("you didnt get your bonus (fun down)");
		hellscape.getCharacter().decreaseFunBy(5);
		
    }
    
}
