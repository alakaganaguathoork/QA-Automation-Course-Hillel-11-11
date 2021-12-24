/**
 * This public class is entry point for Oop2 hometask execution.
 */

package com.company.hometasks.oop2;

public class Oop2Main {

    public static void oop2Main() {

        Button button = new Button( 100, 50);

        Container container = new Container(300, 500);

        System.out.println("Button:");
        button.setType(0);
        System.out.println("Button has type of \"" + button.getType() + "\" type.");
        button.displayed();
        button.roundCorners(2);
        System.out.println();

        System.out.println("Container:");
        container.extendWidth(10, 3);
        System.out.println("New container width is " + container.getWidth());
        container.exists();

    }
}
