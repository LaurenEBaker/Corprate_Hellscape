package com.corporate.hellscape.events;
import com.corporate.hellscape.Hellscape;

public class Spider extends Event {
	private boolean _triggerEnabled;

    public Spider(boolean triggerEnabled) {
        _triggerEnabled = _triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("you were bitten by a posionous spider");
		Character.Health =- 10;
		Character.Stress =+ 5;
		Character.Fun =- 5;

        hellscape.registerEvent(new Spider(false));
    }
}
