package com.corporate.hellscape;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import com.corporate.hellscape.events.Event;
import com.corporate.hellscape.events.RandomEvents.RandomEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckFunHighEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckHealthIncrease;
import com.corporate.hellscape.events.StatCheckEvents.CheckHungerHighEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckHygeneLowEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckSleepLowEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckStressHighEvent;
import com.corporate.hellscape.events.StatCheckEvents.CheckWorkHighEvent;
import com.corporate.hellscape.events.TimedStatusEffectEvent.DecreaseHygeneEvent;
import com.corporate.hellscape.events.TimedStatusEffectEvent.DecreaseStaminaEvent;
import com.corporate.hellscape.events.TimedStatusEffectEvent.DecreaseWorkloadEvent;
import com.corporate.hellscape.events.TimedStatusEffectEvent.IncreaseHungerEvent;
import com.corporate.hellscape.character.Character;

public class Hellscape {

    private Character _character = new Character("Johnny Slaverton");

    private LocalDateTime _gameTime = LocalDateTime.of(
        LocalDate.of(2099, 1, 1),
        LocalTime.of(0, 0, 0) );

    private Collection<Event> _eventList = new ArrayList<Event>();
    private Collection<Event> _pendingNewEvents = new ArrayList<Event>();
    private Collection<Event> _pendingDeletedEvents = new ArrayList<Event>();
    private Collection<String> _messages = new ArrayList<String>();
    private boolean _gameRunning = true;

    public Hellscape() {

        //Timers for affecting character base stats based on regular passage of time
        _eventList.add(new IncreaseHungerEvent(this, _character));
        _eventList.add(new DecreaseStaminaEvent(this));
        _eventList.add(new DecreaseHygeneEvent(this));
        _eventList.add(new DecreaseWorkloadEvent(this));

        //Timers for regularly checking character stats for indirect effects
        _eventList.add(new CheckFunHighEvent(this));
        _eventList.add(new CheckHungerHighEvent(this));
        _eventList.add(new CheckHygeneLowEvent(this));
        _eventList.add(new CheckSleepLowEvent(this));
        _eventList.add(new CheckStressHighEvent(this));
        _eventList.add(new CheckWorkHighEvent(this));
        _eventList.add(new CheckHealthIncrease(this));

        //Spawner for all day-to-day happenings
        _eventList.add(new RandomEvent(this));
    }

    public Character getCharacter() { return _character; }
    public LocalDateTime getGameTime() { return _gameTime; }
    public boolean getGameRunning(){return _gameRunning;}

    public void logMessage(String message) { _messages.add(message); }

    public String[] getPendingMessages() {

        String[] currentMessages = new String[_messages.size()];
        _messages.toArray(currentMessages);
        _messages.clear();

        return currentMessages;
    }

    //Add an event to the pending new list for later insertion
    //into the general events list
    public void registerEvent(Event event) { _pendingNewEvents.add(event); }

    //Add an event to a list to be deleted at the end of
    //a simulation iteration
    public void _markEventForDeletion(Event event) { _pendingDeletedEvents.add(event); }

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

    public void endGame(){ _gameRunning = false; }
}
