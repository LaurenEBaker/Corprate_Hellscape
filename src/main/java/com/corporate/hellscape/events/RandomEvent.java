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
		int num1 = Random.nextInt(30); switch(num1%30) {
	case 0: 
		hellscape.registerEvent( Event "you friend bought you a nice gift");
		Character.Stress =- 5;
		Charcter.Fun =+ 5;
		break;
	case 1: 
		hellscape.registerEvent(Event "you were bitten by a venomous spider");
		Character.Health =- 10;
		Character.Stress =+ 5;
		Character.Fun =- 5;
		break;
	case 2: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 3: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 4: 
		hellscape.registerEvent(Event "you were struck by lightning");
		Charcter.Health = 10;
		break;
	case 5: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 6: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 7: 
		hellscape.registerEvent(Event "your boss gave you an extension");
		Character.Stress =- 20;
		break;
	case 8: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 9: 
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 10: 
		hellscape.registerEvent(Event "your neighbors had a loud party");
		Character.Sleep =- 10;
		Character.Stress =+ 5;
		break;
	case 11: 
		hellscape.registerEvent(Event "you fell into a puddle");
		Character.Hygiene =- 5;
		CHaracter.Stress =+ 5;
		break;
	case 12:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 13:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 14:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 15:
		hellscape.registerEvent(Event "your shower broke");
		Character.Hygiene =- 10;
		Character.Stress =+ 5;
		break;
	case 16:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 17:
		hellscape.registerEvent(Event "you got into a car accident");
		Character.Health =- 30;
		CHaracter.Stress =+ 10;
		break;
	case 18:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 19:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 20:
		hellscape.registerEvent(Event "your favorite game got a new DLC");
		Character.Fun =+ 5;
		break;
	case 21:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 22:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 23:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 24:
		hellscape.registerEvent(Event "you got a free vacation");
		Character.Stress =- 20;
		Character.Fun =+ 15;
		break;
	case 25:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 26:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 27:
		hellscape.registerEvent(Event "Nothing eventful happened");
		Character.Health= Character.getHealth;
		break;
	case 28:
		hellscape.registerEvent(Event "you slept better last night then usual");
		Character.Sleep =+ 15;
		Character.Stress =- 5;
		break;
	case 29:
		hellscape.registerEvent( Event "someone bought lunch for the office");
		Character.Hunger =- 5;
		break;
	};
	hellscape.registerEvent(new RandomEvent(false));
	}

   
}
