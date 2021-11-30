package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TaskC {

    public static void taskC(ArrayList<Integer> a) {

        LinkedHashSet set = new LinkedHashSet(a);

        int size = set.size();

        System.out.println("Task C>>\n Count unique values in a given collection: " + size + "\n");
    }
}
