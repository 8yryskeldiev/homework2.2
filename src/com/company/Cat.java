package com.company;

public class Cat extends  Pet implements  Printable {
    private String species;

    public String getSpecies() {
        return species;
    }

    public Cat(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public void print() {
        System.out.println("Животное: "+getName()+" Порода: "+ species  +"  Внешний вид: "+"\uD83D\uDC31");
    }



}
