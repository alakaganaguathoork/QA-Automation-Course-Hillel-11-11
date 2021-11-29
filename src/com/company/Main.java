//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Random;

import static com.company.TaskA.taskA;
import static com.company.TaskB.taskB;
import static com.company.TaskC.taskC;
import static com.company.TaskD.taskD;
import static com.company.TaskE.taskE;
import static com.company.TaskF.taskF;
import static com.company.TaskG.taskG;
import static com.company.TaskH.taskH;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Random r = new Random();

        while(a.size() < 10) {
            a.add(r.nextInt(10) * (r.nextBoolean() ? 1 : -1)); //hack to generate negative values
        }

        taskA(a);
        taskB(a);
        taskC(a);
        taskD(a);
        taskE(a);
        taskF(a);
        taskG(a);
        taskH(a);
    }
}
