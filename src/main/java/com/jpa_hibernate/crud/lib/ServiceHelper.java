package com.jpa_hibernate.crud.lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ServiceHelper {

    public int getRandomIdAsInt() {
        return Integer.parseInt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyHHmmss"))) - 19197;
    }

    // Method to validate that a string is not null or empty
    public void validateStringNotEmpty(String str, String parameterName) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(parameterName + " cannot be null or empty");
        }
    }


    // Method to validate if the minPrice is less than or equal to maxPrice
    public void validatePriceRange(int minPrice, int maxPrice) {
        if (minPrice > maxPrice) {
            throw new IllegalArgumentException("minPrice cannot be greater than maxPrice");
        }
    }

    // Method to check if a date string is in the correct format "yyyy-MM-dd"
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static boolean isValidDateFormat(String dateStr) {
        try {
            sdf.setLenient(false);
            sdf.parse(dateStr);
            return dateStr.equals(sdf.format(sdf.parse(dateStr)));
        } catch (ParseException | NullPointerException e) {
            return false;
        }
    }
}
