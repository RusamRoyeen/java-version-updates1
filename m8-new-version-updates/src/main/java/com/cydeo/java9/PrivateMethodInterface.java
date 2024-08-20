package com.cydeo.java9;

import java.time.LocalDate;
import java.time.LocalTime;

public interface PrivateMethodInterface {

    boolean isHoliday (LocalDate date);
    default boolean isBusinessDay (LocalDate date) throws IllegalAccessException {
        validate(date);
        return !isHoliday(date);
    }
    default LocalDate nextDay (LocalDate date) throws IllegalAccessException {
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) :nextDate;
    }
    private void validate(LocalDate date) throws IllegalAccessException {
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalAccessException();
        }
    }
}
