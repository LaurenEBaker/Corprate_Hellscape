package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public class StatusEventHungerLow extends StatusEvent{

    @Override
    public boolean isTriggered(Character character) {
        if(character.getHunger < 50){
            return true;
        } 
        return false;
    }

    public void triggerAction(Character character) {
        if(isTriggered(character)){
            character.decreaseHealth();
        }
    }
    
}
