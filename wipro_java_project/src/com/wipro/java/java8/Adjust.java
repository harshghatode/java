package com.wipro.java.java8;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Adjust {

    public static void checkingAdjusters() {
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        // First day of the next month
        LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of the next month: " + dayOfNextMonth);

        // Next Saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday from now is: " + nextSaturday);

        // First day of the current month
        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of the month: " + firstDay);

        // Last day of the current month
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the month: " + lastDay);
    }

    public static void main(String[] args) {
        checkingAdjusters();
    }
}