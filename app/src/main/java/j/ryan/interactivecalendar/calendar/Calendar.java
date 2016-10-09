package j.ryan.interactivecalendar.calendar;


import java.util.GregorianCalendar;

/**
 * Created by Ryan on 10/8/2016.
 */

public class Calendar {
    private Day [] days;
    private final int month;
    private final int year;


    public Calendar(int year, int month , int day){
        this.month = month;
        this.year = year;

        GregorianCalendar gregorianCalendar = new GregorianCalendar(year,month,day);
        int numOfDays = gregorianCalendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        createDays(numOfDays);
    }

    /**
     * Creates an instance of Day for every index in the days array.
     * @param numOfDays the number of days to create
     */
    private void createDays(int numOfDays){
        this.days = new Day[numOfDays-1];

        for(int i = 0 ; i < numOfDays; i++){
            days[i] = new Day();
        }
    }

    /**
     * Writes a reminder to the given day of the month.
     * @param reminder - The reminder/message
     * @param day- The day of the month
     * @return True if reminder was successfully written, false otherwise
     */
    public boolean writeReminder(String reminder, int day){
        Day dayToWriteTo = getDay(day);
        if(dayToWriteTo == null){
            return false;
        }else {
            dayToWriteTo.addReminder(reminder);
            return true;
        }
    }

    /**
     *
     * @return - an array of Days containing instances for each day of the month.
     */
    public Day[] getListOfDays(){
        return days;
    }

    /**
     *
     * @param day - the day of the month
     * @return -
     */
    public Day getDay(int day){
        if(day > 0 && day < days.length)  {
            return days[day - 1];
        }else{
            return null;
        }
    }

    /**
     *
     * @return - The year of this calendar
     */
    public int getYear(){
        return year;
    }

    /**
     *
     * @return - The month of this calendar.
     */
    public int getMonth(){
        return month;
    }


}
