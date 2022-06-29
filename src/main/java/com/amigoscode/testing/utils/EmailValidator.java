package com.amigoscode.testing.utils;

import java.util.function.Predicate;

public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        if (s.contains("@")){
            return true;
        }

        return false;
    }
}
