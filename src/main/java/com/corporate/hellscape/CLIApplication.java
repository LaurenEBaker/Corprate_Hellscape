package com.corporate.hellscape;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.events.InputEvents.FeedCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.RelaxCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.ShowerCharacterInputEvent;
import com.corporate.hellscape.events.InputEvents.SleepCharacterInputEvent;

public class CLIApplication {

    public static void main( String[] args ) throws java.io.IOException {

        Hellscape hellscape = new Hellscape();
        int loopCounter = 0;

        //Main game loop
        while(true) {

            if(!hellscape.SimulateOnce())
                break; 

            loopCounter++;

            //Don't bother getting user input if ten game seconds have not elapsed
            if(loopCounter != 10)
                continue;

            _printCharacterState(hellscape.getCharacter());

            String commandInput = _readUserCommand();
            Event userEvent = _lookUpInputEvent(commandInput);

            if(userEvent != null)
                hellscape.registerEvent(userEvent);

            loopCounter = 0;
        }
    }

    private static String _readUserCommand() throws java.io.IOException {

        System.out.print("ACTION >> ");
        System.out.flush();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine().trim().toLowerCase();
    }

    private static Event _lookUpInputEvent(String commandName) {

        if(commandName.equals("feed"))   return new FeedCharacterInputEvent();
        if(commandName.equals("sleep"))  return new SleepCharacterInputEvent();
        if(commandName.equals("shower")) return new ShowerCharacterInputEvent();
        if(commandName.equals("relax"))  return new RelaxCharacterInputEvent();
                                         return null;
    }

    private static void _printCharacterState(Character character) {

        System.out.println(String.format(
            "Character state - Health: %d | Stress: %d | Hunger: %d | Stamina: %d | Fun: %d | Hygene: %d | Workload: %d",
            character.getHealth(),
            character.getStress(),
            character.getHunger(),
            character.getStamina(),
            character.getFun(),
            character.getHygiene(),
            character.getWorkLoad() ));
    }
}
