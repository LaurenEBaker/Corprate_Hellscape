package com.corporate.hellscape.events;

import java.util.Random;

import com.corporate.hellscape.Hellscape;

public class RandomEvent extends TimedEvent{

    public RandomEvent(Hellscape hellscape) {
		Random ran = new Random();
		SetDelay(ran.nextInt(), hellscape);
	}
	

	@Override
	protected void triggerAction(Hellscape hellscape) {
		int num1 = Random.nextInt(3); switch(num1%3) {
	case 0: 
		hellscape.registerEvent(Event.Gift);
		break;
	case 1: 
		hellscape.registerEvent(Event.Spider);
		break;
	case 2: 
		hellscape.registerEvent(Event.Nothing);
		break;
	};
	}
public class Gift extends Event {
	private boolean _triggerEnabled;
    public Gift(boolean triggerEnabled) {
        _triggerEnabled = _triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("your friend got you a nice gift");
		Character.Stress =- 5;
		Character.Fun =+ 5;

        hellscape.registerEvent(new Gift(false));
    }

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

	public class Nothing extends Event {
	private boolean _triggerEnabled;
    public Nothing(boolean triggerEnabled) {
        _triggerEnabled = _triggerEnabled; }
    public boolean isTriggered(Hellscape hellscape) {
        return _triggerEnabled;}
    public void triggerAction(Hellscape hellscape) {
        System.out.println("Nothing eventful happened");
		Character.Health= Character.getHealth;

        hellscape.registerEvent(new Nothing(false));
    }
}
   
}
