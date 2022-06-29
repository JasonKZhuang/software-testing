package com.amigoscode.testing.utils;

import java.util.function.Predicate;

public class PhoneNumberValidator implements Predicate<String> {
    public boolean validate(String phoneNumber) {
        return false;
    }

    @Override
    public boolean test(String s) {
        if (s.isEmpty()){
            return false;
        }

        if (s.startsWith("+61") == false){
            return false;
        }

        return true;

    }
}
