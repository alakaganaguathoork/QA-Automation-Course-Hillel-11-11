package com.company.hometasks.oop2;

public class Button extends Element {

    //we don't want to reveal these consts anywhere other than this class, so we've made them "final"
    private final String CANCEL_TYPE = "Cancel";
    private final String SUBMIT_TYPE = "Submit";
    int type;
    String typeName;

    Button(int width, int height) {
        super(width, height);
    }

    public void exists() {
        System.out.println("Button exists");
    }

    public void displayed() {
        System.out.println("Button is displayed");
    }

    //overridden method
    @Override
    public void roundCorners(int round) {
        round *= round;
        System.out.println("Buttons has double rounded corners with value " + round + "px");
    }

    private String setButtonType(int type) {
        if (type == 0) {
            typeName = CANCEL_TYPE;
        } else {
            typeName = SUBMIT_TYPE;
        }
        return typeName;
    }

    public String getType() {
        return typeName;
    }

    public void setType(int type) {
        this.type = type;
        System.out.println("Type set to " + setButtonType(type));
    }
}
