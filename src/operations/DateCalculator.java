package operations;

import telran.view.InputOutput;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalculator {
    private static String format = "yyyy-mm-dd";
    private static String prompt = "Enter any date in format " + format;


    public static void addDaysToDate(InputOutput inputOutput) {
        String prompt1 = "How may days you want to add";

        LocalDate date = inputOutput.readDate(prompt, format);
        int days = inputOutput.readInteger(prompt1);

        LocalDate res = date.plusDays(days);
        inputOutput.writeLn("Date -> " + res + "\n");

    }

    public static void daysBetween(InputOutput inputOutput) {
        String prompt = "Enter any date in format " + format;
        LocalDate firstDate = inputOutput.readDate(prompt, format);
        LocalDate secondDate = inputOutput.readDate(prompt, format);

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        inputOutput.writeLn("Days between these days -> " + Math.abs(daysBetween) + "\n");
    }

    public static void subtractDays(InputOutput inputOutput) {
        String prompt = "Enter any date in format " + format;
        String prompt1 = "How may days you want to subtract";

        LocalDate date = inputOutput.readDate(prompt, format);
        int days = inputOutput.readInteger(prompt1);

        LocalDate res = date.minusDays(days);
        inputOutput.writeLn("Date -> " + res + "\n");

    }
}
