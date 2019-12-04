package com.company;

public class Dog extends  Pet implements Printable {
    private  String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println( "Животное: "+getName()+"  "+"Порода: "+ breed+ "  Внешний вид: "+"\uD83D\uDC36 ");

    }
}
