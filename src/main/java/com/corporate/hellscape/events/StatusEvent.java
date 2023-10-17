package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

//NOTE: For issue #6, change this to abstract and create a concrete
//      example child class that implements it for testing (see Hellscape.java)
public class StatusEvent extends Event {

    //TODO: Remove, this is only here to make the skeleton compile
    public StatusEvent() {} 

    //TODO: Implement isTriggered, mark it final, and have it re-dispatch to
    //      an abstract method of StatusEvent that takes *just the character*
    //      as its argument. It's okay if the testing class you make always
    //      returns true or false or something, since the character class
    //      doesn't have any fields yet
    public boolean isTriggered(Hellscape hellscape) { return false; }

    //TODO: Remove this and let child classes that implement StatusEvent handle their own action
    //      (e.g.: Your testing class)
    public void triggerAction(Hellscape hellscape) { }
}
