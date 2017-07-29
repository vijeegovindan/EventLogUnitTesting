package com.theironyard;

import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<Event>();


    public EventLog() {
        this.eventList = eventList;
    }

    public boolean addEvent(Event event) throws IllegalArgumentException {

        boolean bool = false;
        // IllegalArgumentException
       if (event.getName().equals( "" ) || event.getName().equals( null ))
            throw new IllegalArgumentException( "Event name field is empty" );
       if (event.getAction().equals( "" ) || event.getAction().equals( null ))
            throw new IllegalArgumentException( "Event action field is empty" );

       if(!(event.getAction().equals("Face2Face") || event.getAction().equals("PhoneCall") ||
            event.getAction().equals("TextMessaging") || event.getAction().equals("Unknown" ) )){
            throw new IllegalArgumentException( "Event action is not valid" );
        }
        //If no errors add the event
        if (!(event.getName().equals( "" ) || event.getName().equals( null )) &&
                !(event.getAction().equals( "" ) || event.getAction().equals( null ))) {
            if (!eventList.add( event )) {
                bool = false;
            } else bool = true;
        }
        return bool;
    }
    //Number of events entered by user
    public int getNumEvents() {
        return eventList.size();
    }
}




