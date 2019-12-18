package com.hell09.test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar demo
 * @author Fayes
 * @date 18-8-8 下午5:05
 */
public class CalendarDM {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        calendar.setTime(new Date());

        System.out.println(date);
        System.out.println("Calendar.YEAR " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar.DAY_OF_MONTH " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.getCalendarType());

    }

}
