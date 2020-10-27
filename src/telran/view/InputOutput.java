package telran.view;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

public interface InputOutput {
    String readString(String prompt);

    void writeObject(Object obj);

    //============ default methods ============//


    default void writeLn(Object obj) {
        writeObject(obj + "\n");
    }

    default <R> R readObject(String prompt, String errorPrompt, Function<String, R> mapper) {
        while (true) {
            String string = readString(prompt);

            try {
                R result = mapper.apply(string);
                return result;
            } catch (Exception e) {
                writeLn(errorPrompt);
            }

        }

    }

    default String readOption(String prompt, List<String> options) {
        String errorPrompt = "There is no such option in the proposed ones";

        for(String option : options){
            System.out.println(option);
        }

        return readObject(prompt, errorPrompt, o ->{
            if(!options.contains(o)){
                throw new IllegalArgumentException();

            }

            String str = "You have selected the option [" + o + "]";
            return str;
        });
    }

    default Integer readInteger(String prompt) {
        return readObject(prompt, "It's not a Integer number", Integer::parseInt);
    }

    default Integer readInteger(String prompt, int min, int max) {
        return readObject(prompt,
                String.format("It's not a number in the range : [%s - %s]", min, max),
                s -> {
                    int num = Integer.parseInt(s);
                    if (num < min || num > max) {
                        throw new NumberFormatException();
                    }
                    return num;
                });
    }

    default Long readLong(String prompt) {
        return readObject(prompt, "It's not a Long number", Long::parseLong);
    }

    default Double readDouble(String prompt) {
        return readObject(prompt, "It's not a Double number", Double::parseDouble);
    }

    default LocalDate readDate(String prompt, String format) {
        String regex = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
        return readObject(prompt,
                "It's not a date in format : " + format,
                d->{
                    if(!d.matches(regex)) {
                        throw new IllegalArgumentException();
                    }
                    LocalDate date = LocalDate.parse(d);

            return date;
                });
    }
}
