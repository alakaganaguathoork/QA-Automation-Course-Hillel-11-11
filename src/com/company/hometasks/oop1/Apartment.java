/**
 * This public class has a public constructor, encapsulation principle implementation (access modifiers, getters and setters)
 * and few methods with realization.
 */

package com.company.hometasks.oop1;

public class Apartment {

    /**
     * default fields
     */
    int number;
    int phoneNumber;
    int bedroomsNumber;
    int square;

    /**
     * constructor with params
     */
    public Apartment(int number, int phoneNumber, int bedroomsNumber) {
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.bedroomsNumber = bedroomsNumber;
        square = calculateSquare();
    }

    /**
     * protected example
     */
    protected void setNumber(int number) {
        if (number > 0 && number <= 100) {
            this.number = number;
        } else {
            this.number = 0;
        }
    }

    /**
     * public example
     */
    public int getNumber() {

        return number;
    }

    protected void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void ringTheBell() {

        System.out.println("Calling...");
    }

    /**
     * private example, could be changed to "protected" in order to give access all ancestors
     */

    private int calculateSquare() {

        return bedroomsNumber * 15;
    }

    public int getSquare() {
        return square;
    }
}
