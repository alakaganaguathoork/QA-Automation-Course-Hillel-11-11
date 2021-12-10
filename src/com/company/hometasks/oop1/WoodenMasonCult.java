/**
 * This final class has no constructor and has few methods with default and public modifiers
 */
package com.company.hometasks.oop1;

final class WoodenMasonCult {

    int members;
    int sacrifices;


    void performSacrifice() {
        sacrifices = sacrifices + 1;
        System.out.println("Cut them out!");
    }

    void applyMember(boolean yes) {
        members++;
        System.out.println("Greetings to a new member of the cult!");
    }

    public void getSacrificesNumber() {
        System.out.println(sacrifices + " were layed for our wooden goddess.");;
    }

    public void getMembersNumber() {
        System.out.println("We encounter " + members + " members.");
    }
}
