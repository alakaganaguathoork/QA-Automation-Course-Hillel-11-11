package com.company;

import java.util.ArrayList;

public class TaskF {

    public static void taskF(ArrayList<Integer> a) {

        ArrayList positive = new ArrayList();


        for (Integer in : a) {
            if (in >= 0) {
                positive.add(in);
            }
        }

        System.out.println("Task F>>\n Create a collection including only positive values of a given collection:  " + positive + "\n");
    }
}
