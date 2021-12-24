package com.company.hometasks.oop2;

public class Container extends Element {

    Container(int width, int height) {
        super(width, height);
    }

    public void exists() {
        System.out.println("Container exists");
    }

    public void displayed() {
        System.out.println("Container is not displayed");
    }

}
