/**
 * The Main class contains a common ArraList initialization filled with random ints. And each task within a separate class is called once after.
 * So, all method calls in Main operate with one collection of ints, results presented as console logs.
 *
 */

package com.company.hometasks.collections;

import java.util.ArrayList;
import java.util.Random;

import static com.company.hometasks.collections.TaskA.taskA;
import static com.company.hometasks.collections.TaskB.taskB;
import static com.company.hometasks.collections.TaskC.taskC;
import static com.company.hometasks.collections.TaskD.taskD;
import static com.company.hometasks.collections.TaskE.taskE;
import static com.company.hometasks.collections.TaskF.taskF;
import static com.company.hometasks.collections.TaskG.taskG;
import static com.company.hometasks.collections.TaskH.taskH;

public class CollectionsMain {

    public static void collectionsHomeTask() {
        ArrayList a = new ArrayList();
        Random r = new Random();

        while (a.size() < 10) {
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
