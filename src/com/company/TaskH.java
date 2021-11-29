//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TaskH {
    public TaskH() {
    }

    public static void taskH(ArrayList<Integer> a) {
        String result;
        Random r = new Random();
        int value = r.nextInt(10);

        if (a.contains(value)) {
            result = "Match: " + value;
        } else {
            result = "ERROR: No match with " + value;
        }

        System.out.println("Task H>>\n Found prompted value in case if such exists: " + result + "\n");
    }
}
