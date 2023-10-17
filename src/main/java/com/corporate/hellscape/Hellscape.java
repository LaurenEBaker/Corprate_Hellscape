package com.corporate.hellscape;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.events.EventSpawner;
import com.corporate.hellscape.events.StatusEvent;
import com.corporate.hellscape.events.TimedEvent;
import com.corporate.hellscape.character.Character;

public class Hellscape {

    public static void main( String[] args ) {

        Hellscape hellscape = new Hellscape();

        //Main game loop
        while(true) {

            hellscape.SimulateOnce();
        }
    }

    //TODO: Implement a basic sketch of this class in #4
    private Character _character = new Character();

    private LocalDateTime _gameTime = LocalDateTime.of(
        LocalDate.of(2099, 1, 1),
        LocalTime.of(0, 0, 0) );

    private Collection<Event> _eventList = new ArrayList<Event>();
    private EventSpawner _eventSpawner = new EventSpawner();

    private Hellscape() {

        //TODO: Currently using TimedEvent as a concrete class so that things will compile
        //      For issue #7, replace this with your concrete class that *implements* TimedEvent
        _eventList.add(new TimedEvent());

        //TODO: Currently using StatusEvent as a concrete class so that things will compile
        //      For issue #6, replace this with your concrete class that *implements* StatusEvent
        _eventList.add(new StatusEvent());
    }

    //NOTE: When implementing #6, get character from here
    public Character getCharacter() {
        return _character;
    };

    //NOTE: When implementing #7, get time from here
    public LocalDateTime getGameTime() {
        return _gameTime;
    };

    //Simulate a single second of game time
    private void SimulateOnce() {

        for(Event event : _eventList) 
            event.process(this);

        while(true) {

            //TODO: Implement random events in #5
            Event newEvent = _eventSpawner.getPendingEvent(this);

            if(newEvent == null)
                break;

            _eventList.add(newEvent);
        }

        _gameTime = _gameTime.plusSeconds(1);
    }
}
