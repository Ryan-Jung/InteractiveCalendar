package j.ryan.interactivecalendar.calendar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ryan on 10/16/2016.
 */
public class CalendarTest {

    //  Set calendar for October 1, 2016
    Calendar calendar = new Calendar(2016,10,1);

    @Test
    public void getListOfDays() throws Exception {
        Day[] days = calendar.getListOfDays();
        // 31 days in october
        assertTrue(days.length == 31);

        assertNotNull(days[0]);
    }

    @Test
    public void getDay() throws Exception {

        assertNotNull(calendar.getDay(31));

        assertNotNull(calendar.getDay(1));

        assertNull(calendar.getDay(-1));

        assertNull(calendar.getDay(0));

        assertNull(calendar.getDay(32));
    }

    @Test
    public void writeReminder() throws Exception {
        String message1 = "reminder";

        assertFalse(calendar.writeReminder(message1, 100));
        assertFalse(calendar.writeReminder(message1, -100));

        //check if reminder written properly to Day
        Day testDay = new Day();
        testDay.addReminder(message1);
        assertTrue(calendar.writeReminder(message1,1));
        assertTrue(testDay.getReminders().equals(calendar.getDay(1).getReminders()));

    }


}