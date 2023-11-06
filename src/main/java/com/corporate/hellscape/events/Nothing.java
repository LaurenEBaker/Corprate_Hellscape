package com.corporate.hellscape.events;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;


public class Nothing extends Event {
	private boolean _triggerEnabled;
    public Nothing(boolean triggerEnabled) {
        _triggerEnabled = _triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("Nothing eventful happened");
		Character.setHealth= Character.getHealth;

        hellscape.registerEvent(new Nothing(false));
    }
}
