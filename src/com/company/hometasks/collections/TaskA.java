package com.company.hometasks.collections;

import java.util.ArrayList;

public class TaskA {

    public static void taskA(ArrayList<Integer> a) {

        ArrayList numbers = (ArrayList)a.clone();

        System.out.println("Task A>>\n Create new collection filled with elements of given collection: " + numbers + "\n");
    }
}
