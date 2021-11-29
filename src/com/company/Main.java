//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Random r = new Random();

        while(a.size() < 10) {
            a.add(r.nextInt(10) * (r.nextBoolean() ? 1 : -1)); //hack to generate negative values
        }

        TaskA.taskA(a);
        TaskB.taskB(a);
        TaskC.taskC(a);
        TaskD.taskD(a);
        TaskE.taskE(a);
        TaskF.taskF(a);
        TaskG.taskG(a);
        TaskH.taskH(a);
    }
}
