//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskG {
    public TaskG() {
    }

    public static void taskG(ArrayList<Integer> a) {
        ArrayList<Integer> odd = new ArrayList();

        for (Integer in : a) {
            if (in % 2 == 0) {
                odd.add(in);
            }
        }

        System.out.println("Task G>>\n Remove all odd values from given collection: " + odd + "\n");
    }
}
