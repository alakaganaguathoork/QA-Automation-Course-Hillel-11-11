//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskE {

    public static void taskE(ArrayList<Integer> a) {

        int maxValue = (Integer)Collections.max(a);
        int minValue = (Integer)Collections.min(a);
        int sum = 0;

        for(Integer in : a) {
            sum += in;
        }

        System.out.println("Task F>>\n Get max, min and sum of values in given collection: \nMax: " + maxValue + ";\nMin: " + minValue + ";\nSum: " + sum + ".\n");
    }
}
