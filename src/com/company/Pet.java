package com.company;

public abstract class Pet implements Printable  {
    private  String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }


}
