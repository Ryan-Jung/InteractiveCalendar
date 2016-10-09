package j.ryan.interactivecalendar.calendar;

import java.util.ArrayList;

/**
 * Stores the reminders/messages that the user sets.
 * Created by Ryan on 10/8/2016.
 */

public class Day {

    private ArrayList<String> reminders;

    public Day(){
        reminders = new ArrayList<String>();
    }

    /**
     *
     * @return an ArrayList containing the reminders in a day.
     */
    public ArrayList<String> getReminders(){
        return reminders;
    }

    /**
     * Adds the reminder to the end of the list. If the reminder starts with a '!', for important
     * reminders, it will be the first to be displayed. Reminders will be organized by the order
     * in which they are added.
     * @param reminder - The reminder/message for the day
     */
    public void addReminder(String reminder){
        if(reminder.charAt(0) == '!'){
            reminders.add(0,reminder);
        }
        reminders.add(reminder);
    }

    /**
     * Removes a reminder at the specified location.
     * @param reminderIndex
     * @return The reminder that was removed, or null if no reminder was removed.
     */
    public String deleteReminder(int reminderIndex){
        if(reminderIndex >= reminders.size() || reminderIndex < 0){
            return null;
        }
        return reminders.remove(reminderIndex);
    }


}
