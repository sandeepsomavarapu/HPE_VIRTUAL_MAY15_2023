package com.hp.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeApiExamples {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();// immutable
		System.out.println(date);
		date.plusDays(5);
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
		LocalDateTime datetime = LocalDateTime.now();

		System.out.println(datetime);

		LocalDateTime dateTime = LocalDateTime.of(1993, 8, 10, 10, 45);
		System.out.println(dateTime);

		LocalDate localdate = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, localdate);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());

		
		System.out.println();
		ZoneId zone=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone);
		System.out.println(zt);//Asia/Calcutta

	}

}
