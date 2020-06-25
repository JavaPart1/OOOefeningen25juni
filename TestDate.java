package be.vdab.OOOef25juni;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class TestDate {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000,4,6);
        //Date toDay = new Date();
        LocalDate toDay = LocalDate.now();

        System.out.println("birthday: " + birthday);
        System.out.println("today: " + toDay);

        System.out.println(toDay.getYear()); // 2017
        System.out.println(toDay.getMonthValue()); // 11
        System.out.println(toDay.getDayOfMonth()); // 25
        System.out.println(toDay.getDayOfYear());  // 329
        System.out.println(DAYS.between(toDay,birthday));
    }
}
