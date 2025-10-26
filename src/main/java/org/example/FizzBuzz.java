package org.example;

public class FizzBuzz {
    public String calculate(int i) {
        if (i % 5 == 0) {
            return "Buzz";
        }
        return "Fizz";
    }
}
