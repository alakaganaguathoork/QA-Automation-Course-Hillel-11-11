package com.company.hometasks.collections;

import java.util.ArrayList;

public class TaskG {

    public static void taskG(ArrayList<Integer> a) {

        ArrayList odd = new ArrayList();

        for (Integer in : a) {
            if (in % 2 == 0) {
                odd.add(in);
            }
        }

        System.out.println("Task G>>\n Remove all odd values from given collection: " + odd + "\n");
    }
}
