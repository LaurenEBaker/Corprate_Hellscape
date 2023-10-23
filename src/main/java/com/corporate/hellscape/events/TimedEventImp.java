package com.corporate.hellscape.events;

import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;


public class TimedEventImp extends TimedEvent {

    private int delayDurationSeconds;
    private long startTime;
    private LocalDateTime eventTime;


    protected TimedEventImp(int delayDurationSeconds) {
        super(delayDurationSeconds);
        this.delayDurationSeconds = delayDurationSeconds;
    }

    public boolean isTriggered(Hellscape hellscape, Character character) {
        long currentTime = System.currentTimeMillis() /1000; 
        return currentTime - startTime >= delayDurationSeconds;
    }
    //panic mode method
    public void decreaseStatsOverTime(Character character, Hellscape hellscape){

        int rateOfDecrease = 1;

        int healthDecrease = rateOfDecrease * delayDurationSeconds;
        int stressDecrease = rateOfDecrease * delayDurationSeconds;
        int hungerDecrease = rateOfDecrease * delayDurationSeconds;
        int sleepDecrease = rateOfDecrease * delayDurationSeconds;
        int funDecrease = rateOfDecrease * delayDurationSeconds;
        int hygieneDecrease = rateOfDecrease * delayDurationSeconds;
        int workLoadIncrease = rateOfDecrease * delayDurationSeconds;

        

        character.decreaseHealth(healthDecrease);
        character.decreaseStress(stressDecrease);
        character.decreaseHunger(hungerDecrease);
        character.decreaseSleep(sleepDecrease);
        character.decreaseFun(funDecrease);
        character.decreaseHygiene(hygieneDecrease);
        character.increaseWorkLoad(workLoadIncrease);

    }

    public void celebration(Hellscape hellscape, Character character){

        if (hellscape.getGameTime().isAfter(eventTime)){
        character.increaseFun();
        character.decreaseStress();
        character.increaseSleep();
        character.decreaseWorkLoad();
        }
    }

    public void apocalypse(Hellscape hellscape, Character character){
         if (hellscape.getGameTime().isAfter(eventTime)){

            character.frenzy();
         }
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
