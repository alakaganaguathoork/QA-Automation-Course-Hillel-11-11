//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TaskC {

    public static void taskC(ArrayList<Integer> a) {

        LinkedHashSet<Integer> set = new LinkedHashSet(a);

        int size = set.size();

        System.out.println("Task C>>\n Count unique values: " + size + "\n");
    }
}
