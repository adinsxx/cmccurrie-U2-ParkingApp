package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Time extends MachineOne{
    public static void main(String[] args) {
        getRandomTime();
    }

    static void getRandomTime() {
        //Generates a random number between 7 and 12
        int randomTime = ThreadLocalRandom.current().nextInt(7, 12);
        System.out.println(randomTime);
    }
}
