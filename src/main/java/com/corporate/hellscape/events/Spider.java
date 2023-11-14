package com.corporate.hellscape.events;
import com.corporate.hellscape.Hellscape;

public class Spider extends Event {
	private boolean _triggerEnabled;

    public Spider(boolean triggerEnabled) {
        _triggerEnabled = triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("you were bitten by a posionous spider");

		hellscape.getCharacter().decreaseHealth(5);
		hellscape.getCharacter().increaseStress(5);
		hellscape.getCharacter().decreaseFun(5);
    }
}
