package com.company.hometasks.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TaskE {

    public static void taskE(ArrayList<Integer> a) {

        int maxValue = Collections.max(a);
        int minValue = Collections.min(a);
        int sum = 0;

        for(Integer in : a) {
            sum += in;
        }

        System.out.println("Task E>>\n Get max, min and sum of values in given collection: \nMax: " + maxValue + ";\nMin: " + minValue + ";\nSum: " + sum + ".\n");
    }
}
