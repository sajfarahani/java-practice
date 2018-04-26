package com.example.mypackage;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String , String> languages = new HashMap<>();
        languages.put("Java", "a compile high level, object-oriented, platform independant language");
        languages.put("Python", "an interperted, OO, high-levvel program");
        languages.put("Algo", "an algo language");
        languages.put("BASIC", "beginner symbolic instruction code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
        }

        System.out.println("========================================");

        if(languages.remove("Algo", "an algo language")){
            System.out.println("Algo removed");
        } else {
            System.out.println("Algo not removed, key/value pair not found");
        }

        if (languages.replace("Lisp","This will not work", "a func language")) {
            System.out.println("Lisp replaced");
        } else{
            System.out.println("Lisp is not replaced");
        }

//        System.out.println(languages.replace("Scale", "This will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
