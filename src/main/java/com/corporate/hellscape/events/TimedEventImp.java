package com.corporate.hellscape.events;

import com.corporate.hellscape.Hellscape;

public class TimedEventImp extends TimedEvent {

    private int delayDurationSeconds;
    private long startTime;

    protected TimedEventImp(int delayDurationSeconds) {
        super(delayDurationSeconds);
        this.delayDurationSeconds = delayDurationSeconds;
    }

    public boolean isTriggered(Hellscape hellscape, Character character) {
        long currentTime = System.currentTimeMillis() / 1000; 
        return currentTime - startTime >= delayDurationSeconds;
    }
    //ignore auto generated so that it compiles
    @Override
    public boolean isTriggered(Hellscape hellscape) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTriggered'");
    }
    //ignore auto generated so that it compiles
    @Override
    protected void triggerAction(Hellscape hellscape) {
        // TODO Auto-generated method stub
        System.out.println("Timed event triggered in Hellscape!");
        throw new UnsupportedOperationException("Unimplemented method 'triggerAction'");
    }

    


   
    
}
