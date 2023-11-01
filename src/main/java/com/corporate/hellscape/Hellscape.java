package com.corporate.hellscape;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.events.EventSpawner;
import com.corporate.hellscape.character.Character;
import com.corporate.hellscape.events.TimedEventImp;
import com.corporate.hellscape.events.ExampleSelfSpawningEvent;
import com.corporate.hellscape.events.StatusEventHungerLow;
import com.corporate.hellscape.events.CheckHungerEvent;



public class Hellscape {

    //TODO: Implement a basic sketch of this class in #4
    private Character _character = new Character();

    private LocalDateTime _gameTime = LocalDateTime.of(
        LocalDate.of(2099, 1, 1),
        LocalTime.of(0, 0, 0) );

    private Collection<Event> _eventList = new ArrayList<Event>();
    private Collection<Event> _pendingNewEvents = new ArrayList<Event>();
    private Collection<Event> _pendingDeletedEvents = new ArrayList<Event>();
    private EventSpawner _eventSpawner = new EventSpawner();
    private boolean _gameRunning = true;

    private Hellscape() {

        _eventList.add(new CheckHungerEvent(30, this, _character));

        //TODO: Remove this class in the future, it's only here for example purposes
        _eventList.add(new ExampleSelfSpawningEvent(true));

        //TODO: Currently using StatusEvent as a concrete class so that things will compile
        //      For issue #6, replace this with your concrete class that *implements* StatusEvent
        _eventList.add(new StatusEventHungerLow());
    }

    //NOTE: When implementing #6, get character from here
    public Character getCharacter() {

        return _character;
    };

    //NOTE: When implementing #7, get time from here
    public LocalDateTime getGameTime() {

        return _gameTime;
    };

    //Add an event to the pending new list for later insertion
    //into the general events list
    public void registerEvent(Event event) {

        _pendingNewEvents.add(event);
    }

    //Add an event to a list to be deleted at the end of
    //a simulation iteration
    public void _markEventForDeletion(Event event) {

        _pendingDeletedEvents.add(event);
    }

    //Add any events that were added to the pending new list
    //to the event list *after* we're done iterating the event list
    private void _addNewlyCreatedEvents() {

        _eventList.addAll(_pendingNewEvents);
        _pendingNewEvents.clear();
    }

    //Remove any events that were detected retired during simulation
    private void _removeDeletedEvents() {

        _eventList.removeAll(_pendingDeletedEvents);
        _pendingDeletedEvents.clear();
    }

    //Simulate a single second of game time
    public boolean SimulateOnce() {

        for(Event event : _eventList) {

            event.process(this);

            if(event.isRetired())
                _markEventForDeletion(event);
        }

        while(true) {

            Event newEvent = _eventSpawner.getPendingEvent(this);

            if(newEvent == null)
                break;

            _eventList.add(newEvent);
        }

        //NOTE: We do things this way because Java will give you a runtime
        //      exception if you try to modify the thing being iterated
        //      *while* it's being iterated over
        _removeDeletedEvents();
        _addNewlyCreatedEvents();

        _gameTime = _gameTime.plusSeconds(1);

        if(_character.getHealth() <= 0)
            endGame();
        
        return _gameRunning;
    }

    private void endGame(){
        _gameRunning = false;
    }
}
