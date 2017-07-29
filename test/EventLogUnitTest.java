import com.theironyard.Main;
import org.junit.Assert;
import org.junit.Test;
import com.theironyard.Event;
import com.theironyard.EventLog;


public class EventLogUnitTest {

    @Test
    public void testIfEventAddedSuccessfully() {
        EventLog eventLog = new EventLog();
        Event event1 = new Event( "Event 1", "Face2Face" );
        Assert.assertEquals(true, eventLog.addEvent(event1));

        Event event2 = new Event( "12345 67890", "PhoneCall" );
        Assert.assertEquals(true, eventLog.addEvent(event2));

        Event event3 = new Event( "12345 67890", "TextMessaging" );
        Assert.assertEquals(true, eventLog.addEvent(event2));

        Event event4 = new Event( "12345 67890", "Unknown" );
        Assert.assertEquals(true, eventLog.addEvent(event4));
    }

   @Test(expected = IllegalArgumentException.class)
    public void testIfTheFieldsEmpty(){
        EventLog eventLog = new EventLog();
        Event event1 = new Event("Event 1", "");
        eventLog.addEvent(event1);

        Event event2 = new Event("", "TextMessaging");
        eventLog.addEvent(event2);

        Event event3 = new Event("", "");
        eventLog.addEvent(event3);
    }

    @Test(expected = NullPointerException.class)
    public void testIfTheFieldsNull(){
        EventLog eventLog = new EventLog();
        Event event1 = new Event("Event 1", null);
        eventLog.addEvent(event1);

        Event event2 = new Event(null, "TextMessaging");
        eventLog.addEvent(event2);

        Event event3 = new Event(null, null);
        eventLog.addEvent(event3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfValidActionField(){
        EventLog eventLog = new EventLog();
        Event event1 = new Event("Event 1", "abc abc");
        eventLog.addEvent(event1);
    }

    @Test
    public void testNumberOfEventsAdded(){
        EventLog eventLog = new EventLog();
        Event event1 = new Event( "Event 1", "Face2Face" );
        eventLog.addEvent(event1);
        Event event2 = new Event( "12345 67890", "PhoneCall" );
        eventLog.addEvent(event2);
        Assert.assertEquals(2, eventLog.getNumEvents());
    }

}

