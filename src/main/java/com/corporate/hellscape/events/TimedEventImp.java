package com.corporate.hellscape.events;

<<<<<<< HEAD
import java.time.LocalDateTime;

import com.corporate.hellscape.Hellscape;
import com.corporate.hellscape.character.Character;
=======
import com.corporate.hellscape.Hellscape;
>>>>>>> c00e3b69ee82bc908a0a098699992308b4a98d68


public class TimedEventImp extends TimedEvent {

<<<<<<< HEAD
    private long delayDurationSeconds;
    private LocalDateTime eventTime;


    public TimedEventImp(int delayDurationSeconds,Hellscape hellscape) {
        super(delayDurationSeconds, hellscape);
        this.delayDurationSeconds = delayDurationSeconds;
        eventTime = hellscape.getGameTime().plusSeconds(delayDurationSeconds);
    }

    public boolean isTriggered(Hellscape hellscape) {
        LocalDateTime currentTime = hellscape.getGameTime();
        return eventTime.isAfter(currentTime) ;
    }

   

    @Override
    protected void triggerAction(Hellscape hellscape) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'triggerAction'");
    }

   
  

  
   
    


   
    
}
=======
    public TimedEventImp(Hellscape hellscape) {
        super(10, hellscape);
    }

    protected void triggerAction(Hellscape hellscape) {

        throw new UnsupportedOperationException("TimedEventImp triggerd after 10 game seconds");
    }
}
>>>>>>> c00e3b69ee82bc908a0a098699992308b4a98d68
