//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskF {
    public TaskF() {
    }

    public static void taskF(ArrayList<Integer> a) {
        ArrayList<Integer> positive = new ArrayList();


        for (Integer in : a) {
            if (in >= 0) {
                positive.add(in);
            }
        }

        System.out.println("Task F>>\n Create a collection including only positive values of a given collection:  " + positive + "\n");
    }
}
