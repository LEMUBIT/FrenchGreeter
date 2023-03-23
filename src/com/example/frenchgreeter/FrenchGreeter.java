package com.example.frenchgreeter;

import com.example.greeterapi.Greeter;

public class FrenchGreeter implements Greeter {
    public String greet(String name) {
        return "Bonjour " + name;
    }
}




