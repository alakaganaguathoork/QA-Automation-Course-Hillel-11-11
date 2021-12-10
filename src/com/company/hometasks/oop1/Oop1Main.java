/**
 * This public class is entry point for Oop1 hometask execution, creates objects Apartment and Woods
 * and calls their methods.
 */
package com.company.hometasks.oop1;

public class Oop1Main {

    public static void oop1Main() {

        /*
         * -------------------- Apartments part --------------------
         */
        Apartment apartment = new Apartment(0, 0, 3);

        int newNumber;
        apartment.setNumber(12);
        newNumber = apartment.getNumber();

        apartment.setPhoneNumber(1234567890);

        System.out.println("Apt. number is " + newNumber);
        //System.out.println("Apt. number is " + apartment.number); example of 2nd option to get number
        System.out.println("Square is " + apartment.getSquare()); //example of getter usage without setting local variable
        System.out.println("Phone number is " + apartment.getPhoneNumber());

        /*
         * -------------------- Woods part --------------------
         */
        Woods woods = new Woods();

        System.out.println();
        woods.printNoWoodsMessage();

        System.out.println();
        woods.printWoods();

        /*
         * -------------------- MasonCult part --------------------
         */

        WoodenMasonCult woodenMasonCult = new WoodenMasonCult();

        System.out.println();
        woodenMasonCult.applyMember(true);

        System.out.println();
        woodenMasonCult.performSacrifice();

        System.out.println();
        woodenMasonCult.getSacrificesNumber();

        System.out.println();
        woodenMasonCult.getMembersNumber();
    }
}
