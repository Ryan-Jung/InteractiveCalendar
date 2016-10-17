package j.ryan.interactivecalendar.calendar;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Ryan on 10/8/2016.
 */
public class DayTest {


    @Test
    public void addReminder() throws Exception {
        Day day = new Day();
        day.addReminder("reminder");
        assertNotNull(day.getReminders().get(0));

        //check if important reminder is placed first in the list
        day.addReminder("!important reminder");
        assertTrue(day.getReminders().get(0).equals("important reminder"));

    }

    @Test
    public void deleteReminder() throws Exception {
        Day day = new Day();

        day.addReminder("reminder1");
        day.addReminder("reminder2");

        assertNull(day.deleteReminder(2));
        assertNull(day.deleteReminder(-999));

        day.deleteReminder(0);

        assertTrue(day.getReminders().get(0).equals("reminder2"));
    }

}