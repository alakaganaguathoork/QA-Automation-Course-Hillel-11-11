package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TaskH {

    public static void taskH(ArrayList<Integer> a) {

        String result;
        Random r = new Random();
        int value = r.nextInt(10);

        if (a.contains(value)) {
            result = "Match: " + value;
        } else {
            result = "ERROR: No match with " + value;
        }

        System.out.println("Task H>>\n Found match with random value in case if such exists in a given collection: " + result + "\n");
    }
}
