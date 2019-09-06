package com.hell09.test;

import org.springframework.cglib.core.Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Date;

/**
 * Date demo
 * @author Fayes
 * @date 18-8-8 下午5:05
 */
public class DateTimeDm {

    public static void main(String[] args) {
//    	dateTimeTest();
    	
//    	timeTest();
//    	System.out.println(System.getenv());
//    	Calendar calendar = Calendar.getInstance();
//    	calendar.setTime(new Date());
//    	System.out.println(calendar);
//    	System.out.println(calendar.get(calendar.YEAR));
//    	System.out.println(calendar.get(calendar.MONTH));

    	
    	
    }
    
    static void timeTest() {
    	LocalDateTime nowDateTime = LocalDateTime.now();
    	LocalDateTime plusyears = nowDateTime.plusYears(1);
    	LocalDateTime plusDays = nowDateTime.plusDays(3);
    	LocalDateTime plusHours = nowDateTime.plusHours(5);
    	System.out.println("nowDateTime: " + nowDateTime);
    	System.out.println("plusyears: " + plusyears);
    	System.out.println("plusDays: " + plusDays);
    	System.out.println("plusHours: " + plusHours);
    	System.out.println("now year: " + Year.now());

		long years1 = nowDateTime.until(plusyears, ChronoUnit.YEARS);
		long years2 = ChronoUnit.YEARS.between(nowDateTime, plusyears);
    	System.out.println("years1=" + years1 + "  years2=" + years2);

    	long days1 = nowDateTime.until(plusDays, ChronoUnit.DAYS);
    	long days2 = ChronoUnit.DAYS.between(nowDateTime, plusDays);
    	System.out.println("days1=" + days1 + "  days2=" + days2);

    	long hour1 = nowDateTime.until(plusHours, ChronoUnit.HOURS);
    	long hour2 = ChronoUnit.HOURS.between(nowDateTime, plusHours);
    	System.out.println("hour1=" + hour1 + "  hour2=" + hour2);
    	String s1 = "00";
    	LocalDate atDay = Year.now().atDay(1);
		System.out.println("atDay: " + atDay);

		System.out.println("YearMonth: " + YearMonth.now());
		
		ValueRange valueRange = ValueRange.of(1, 12);
		System.out.println("valueRange1: " + valueRange.isFixed());
		System.out.println("valueRange2: " + valueRange.getMaximum());
		System.out.println("valueRange3: " + valueRange.getLargestMinimum());
		System.out.println("valueRange4: " + valueRange.checkValidValue(3l, ChronoField.MONTH_OF_YEAR));

		System.out.println("DecimalStyle: " + DecimalStyle.STANDARD);
		System.out.println("DecimalStyle: " + DecimalStyle.ofDefaultLocale().getDecimalSeparator());
		
    }
    
	static void dateTimeTest() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalTime localTime2 = LocalTime.now();
		System.out.println("localTime2// " + localTime2);
		localTime2.plusHours(2);
		System.out.println("localTime2plus// " + localTime2);

		LocalDate localDate2 = LocalDate.now();
		System.out.println("localDate2// " + localDate2);

		LocalDate plus = localDate2.plus(1, ChronoUnit.WEEKS);
		System.out.println("localDate2plusweek// " + plus);

		LocalDate plus1 = localDate2.plus(1, ChronoUnit.YEARS);
		System.out.println("localDate2plusyear// " + plus1);

		LocalDateTime plus2 = localDateTime.plus(1, ChronoUnit.YEARS);
		System.out.println("localDateTime2plusyear// " + plus2);

		Period period = Period.between(plus1, localDate);
		System.out.printf("日期%s和日期%s相差%s年%s月%s日// ", plus1, localDate, period.getYears(), period.getMonths(),
		        period.getDays());

		System.out.println("compareTo// " + plus2.compareTo(localDateTime));
		System.out.println("isAfter// " + plus2.isAfter(localDateTime));
		System.out.println("isBefore// " + plus2.isBefore(localDateTime));

		Instant instant = Instant.now();

		System.out.println("localDateTime// " + localDateTime);
		System.out.println("DateTimeFormatter// " + localDateTime.format(formatter));
		System.out.println("localDate// " + localDate);
		System.out.println("localTime/// " + localTime);
		System.out.println("instant/// " + instant);
	}

}
