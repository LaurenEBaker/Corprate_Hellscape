package com.corporate.hellscape.events.StatCheckEvents;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.StatCheckEvent;

public class CheckHealthIncrease extends StatCheckEvent {

    public CheckHealthIncrease(Hellscape hellscape) {
        super(30, hellscape);
    }

    
    protected boolean statIsAtThreshold(Character character) {
      if (character.getHunger()<50 && character.getHygiene()>50 && character.getStress()<50 && character.getStamina()>50){
        return true;
      }else return false;
      
    }

    
    protected void statTriggerAction(Hellscape hellscape) {
       hellscape.getCharacter().increaseHealthBy(2);
    }
    
}
