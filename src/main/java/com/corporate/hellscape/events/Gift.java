package com.corporate.hellscape.events;
import com.corporate.hellscape.Hellscape;


public class Gift extends Event {
	private boolean _triggerEnabled;
    public Gift(boolean triggerEnabled) {
        _triggerEnabled = triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("your friend got you a nice gift");
		hellscape.getCharacter().decreaseStress();
		hellscape.getCharacter().increaseFun();;
    }
}
