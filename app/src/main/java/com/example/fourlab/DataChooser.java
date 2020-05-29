package com.example.fourlab;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataChooser {
    long diffInMillisec = 0;
    Calendar calendar = new GregorianCalendar();
    Calendar calendarCurrent = new GregorianCalendar();

    public int dataLeft(int year, int month, int dayOfMonth) {
        calendar.set(dayOfMonth, (month + 1), year);
        diffInMillisec = calendarCurrent.getTimeInMillis() - calendar.getTimeInMillis();
        int days = (int) (diffInMillisec / (24 * 60 * 60 * 1000));
        int daysLong = days+61;
        return daysLong;
    }
}
