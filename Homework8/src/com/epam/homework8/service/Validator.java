package com.epam.homework8.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public void validateAuthorName(String name) throws Exception {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z\\s.]*$");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.find()) {
            throw new Exception("Author name should start from capital letter");

        }
    }

    public void validateYear(String year) throws Exception {
        Pattern pattern = Pattern.compile("^\\d{4}$");
        Matcher matcher = pattern.matcher(year);
        if (!matcher.find()) {
            throw new Exception("Invalid year");

        }
    }

    public void validatePercent(String percent) throws Exception {
        Pattern pattern = Pattern.compile("^(\\d+)$|^(\\d+[.]\\d+)$");
        Matcher matcher = pattern.matcher(percent);
        if (!matcher.find()) {
            throw new Exception("Invalid percent");
        }
    }
}
