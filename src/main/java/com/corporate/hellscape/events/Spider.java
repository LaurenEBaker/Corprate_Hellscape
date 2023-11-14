package com.corporate.hellscape.events;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;

public class Spider extends Event {
	private boolean _triggerEnabled;

    public Spider(boolean triggerEnabled) {
        _triggerEnabled = triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("you were bitten by a posionous spider");

		Character.decreaseHealth(5);
		Character.increaseStress(5);
		Character.decreaseFun(5);
    }
}
