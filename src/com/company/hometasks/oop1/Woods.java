/**
 * This default class has protected constructor which does not apply any parameter
 */

package com.company.hometasks.oop1;

class Woods {

    String woods[] = new String[]{"Oak", "Pine", "Birch"};

    protected Woods() {

    }

    public void printNoWoodsMessage() {
        System.out.println("There is no woods in our storage yet. Come back later this year.");
    }

    void printWoods() {
        System.out.println("Hey, lucky-chuky, we have:");
        for (String wood : woods) {
            System.out.println("- " + wood);
        }
    }

}


