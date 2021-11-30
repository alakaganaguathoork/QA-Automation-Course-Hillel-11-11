package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TaskB {

    public static void taskB(ArrayList<Integer> a) {

        LinkedHashSet set = new LinkedHashSet(a);

        System.out.println("Task B>>\n Return unique values from a given collection: " + set + "\n");
    }
}
