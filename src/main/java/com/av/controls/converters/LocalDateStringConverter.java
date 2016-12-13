package com.av.controls.converters;

import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by alexey on 13.12.16.
 */
public class LocalDateStringConverter extends StringConverter<LocalDate> {
    private String pattern = "MM/dd/yyyy";
    private DateTimeFormatter dtFormatter;
    public LocalDateStringConverter() {
        dtFormatter = DateTimeFormatter.ofPattern(pattern);
    }
    public LocalDateStringConverter(String pattern) {
        this.pattern = pattern;
        dtFormatter = DateTimeFormatter.ofPattern(pattern);
    }
    @Override
    public LocalDate fromString(String text) {
        LocalDate date = null;
        if (text != null && !text.trim().isEmpty()) {
            date = LocalDate.parse(text, dtFormatter);
        }
        return date;
    }

    @Override
    public String toString(LocalDate date) {
        String text = null;
        if (date != null) {
            text = dtFormatter.format(date);
        }
        return text;
    }
}
