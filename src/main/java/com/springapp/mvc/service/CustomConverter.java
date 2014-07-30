package com.springapp.mvc.service;

public class CustomConverter {
    public static String formatName(String name) {
        if (name.length() < 5) {
            return name.replace('a', 'o').toUpperCase();
        } else {
            return name.replace('a', 'i').toUpperCase();
        }
    }
}
