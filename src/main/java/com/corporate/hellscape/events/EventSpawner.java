package com.corporate.hellscape.events;

import java.util.Random;

import com.corporate.hellscape.Hellscape;

public class EventSpawner {



    public Event getPendingEvent(Hellscape hellscape) { 
        Random ran = new Random();
	int num1 = ran.nextInt(20); switch(num1%20) {
	case 0: 
		System.out.println("you friend bought you a nice gift");
		//Stress =- 5;
		//Fun =+ 5;
		break;
	case 1: 
		System.out.println("you were bitten by a venomous spider");
		//Health =- 10;
		//Stress =+ 5;
		//Fun =- 5;
		break;
	case 2: 
		System.out.println("your favorite game got a new DLC");
		//Fun =+ 5;
		break;
	case 3: 
		System.out.println("you slept better last night then usual");
		//Sleep =+ 15;
		//Stress =- 5;
		break;
	case 4: 
		System.out.println("you were struck by lightning and died");
		//Health = 0;
		System.out.println("GAME OVER");
		break;
	case 5: 
		System.out.println("5");
		//nothing happened;
		break;
	case 6: 
		System.out.println("you got a free vacation");
		//Fun = 100;
		break;
	case 7: 
		System.out.println("your boss gave you an extension");
		//Stress =- 20;
		break;
	case 8: 
		System.out.println("8");
		//nothing happened;
		break;
	case 9: 
		System.out.println("9");
		//nothing happened;
		break;
	case 10: 
		System.out.println("your neighbors had a loud party");
		//Sleep =- 10;
		//Stress =+ 5;
		break;
	case 11: 
		System.out.println("you fell into a puddle");
		//Hygiene =- 5;
		//Stress =+ 5;
		break;
	case 12:
		System.out.println("12");
		//nothing happened;
		break;
	case 13:
		System.out.println("someone bought lunch for the office");
		//Hunger =- 5;
		break;
	case 14:
		System.out.println("14");
		//nothing happened;
		break;
	case 15:
		System.out.println("your shower broke");
		//Hygiene =- 10;
		//Stress =+ 5;
		break;
	case 16:
		System.out.println("16");
		//nothing happened;
		break;
	case 17:
		System.out.println("you got into a car accident");
		//Health =- 30;
		//Stress =+ 10;
		break;
	case 18:
		System.out.println("18");
		//nothing happened;
		break;
	case 19:
		System.out.println("19");
		//nothing happened;
		break;
	
	}; 
    {return null;}
} 
}

