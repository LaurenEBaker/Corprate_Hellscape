package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public abstract class StatCheckEvent extends TimedEvent {

    protected StatCheckEvent(int delayDurationSeconds, Hellscape hellscape) {
        super(delayDurationSeconds, hellscape);
    }

    protected final void triggerAction(Hellscape hellscape) {

        if(statIsAtThreshold(hellscape.getCharacter()))
            statTriggerAction(hellscape);

        try {
            hellscape.registerEvent(
                this.getClass()
                    .getConstructor(hellscape.getClass())
                    .newInstance(hellscape) );
        } catch(Exception ex) {}
    }

    protected abstract boolean statIsAtThreshold(Character character);
    protected abstract void statTriggerAction(Hellscape hellscape);
}
