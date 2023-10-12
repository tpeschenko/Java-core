package org.regular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {
    public Time() {
    }

    public static String timeIsNow() {
        LocalDate var0 = LocalDate.now();
        DateTimeFormatter var1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String var2 = var0.format(var1);
        return var2;
    }
}
