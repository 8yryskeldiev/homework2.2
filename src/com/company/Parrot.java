package com.company;

public class Parrot extends Pet  implements Printable{
    private String type;

    public String getType() {
        return type;
    }

    public Parrot(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println( "Животное: "+getName()+ " Тип: "+type+ "  Внешний вид: "+"\uD83E\uDD9C");
    }
}
