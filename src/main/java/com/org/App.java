package com.org;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */


public class App {
    public static void main(String[] args) {
        Person person = new Person("john", "doe");
        String json = convertToJson(person);
        System.out.println("JSON: " + json);

        String capitalized = capitalizeString("hello world");
        System.out.println("Capitalized: " + capitalized);
    }

    public static String convertToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}