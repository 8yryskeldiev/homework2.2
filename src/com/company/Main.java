package com.company;

public class Main {

    public static void main(String[] args) {
createObject("Cat");
createObject("Dog");
createObject("Parrot");

    }


    public static Pet createObject(String className ) {
        switch (className) {
            case "Cat":
                Cat cat = new Cat("КОШКА","Мейн-кун");
                cat.print();
                return cat;
            case "Dog":
                Dog dog = new Dog("СОБАКА","Лабрадор");
                dog.print();
                return dog;
            case"Parrot":
            Parrot parrot= new Parrot("ПОПУГАЙ","Какаду");
            parrot.print();
            return parrot;

        }
        return null;
    }
}
