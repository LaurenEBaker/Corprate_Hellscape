package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

//This isn't a 'real' event class and only exists as an example of
//how Hellscape::registerEvent() is supposed to be used
public class ExampleSelfSpawningEvent extends Event {
    
    private boolean _triggerEnabled;

    public ExampleSelfSpawningEvent(boolean triggerEnabled) {

        _triggerEnabled = triggerEnabled;
    }

    public boolean isTriggered(Hellscape hellscape) {

        //Either immediately trigger on the next cycle
        //or not at all
        return _triggerEnabled;
    }

    //This will only ever happen if the object was created with
    //triggerEnabled = true
    public void triggerAction(Hellscape hellscape) {

        System.out.println("Self-spawning event was triggered, adding a new event to the list");

        //When we're triggered, add another new event to the list
        //Set the trigger setting to false so that the child event
        //doesn't *also* start adding events
        hellscape.registerEvent(new ExampleSelfSpawningEvent(false));
    }
}
