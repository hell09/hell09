package com.hell09.test;

import org.springframework.cglib.core.Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Date demo
 * @author Fayes
 * @date 18-8-8 下午5:05
 */
public class DateTimeDm {

    public static void main(String[] args) {
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
        System.out.printf("日期%s和日期%s相差%s年%s月%s日// ", plus1, localDate, period.getYears(), period.getMonths(), period.getDays());

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
