/**
 * This abstract class is a basic class in a hierarchy of html-page elements
 */

package com.company.hometasks.oop2;

public abstract class Element {

    private int width;
    private int height;

    Element(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    };

    public void setWidth() {
         this.width = width;
    };


    public int getHeight() {
        return height;
    };

    public void setHeight() {
        this.width = width;
    };

    //abstract methods
    abstract void exists();

    abstract void displayed();

    //parent method to override
    public void roundCorners(int round) {
        System.out.println("Corners are rounded to " + "px");
    }

    //original method to reload
    public int extendWidth(int width) {
        this.width = width++;
        return this.width;
    }

    //reloaded method
    public int extendWidth(int width, int size) {
        this.width = width * size;
        return this.width;
    }

}
