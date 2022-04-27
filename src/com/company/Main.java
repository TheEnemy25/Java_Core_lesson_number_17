package com.company;

public class Main {

    public static void main(String[] args) {
        //1 завдання
        System.out.println();
        System.out.println("1 Завдання");
        Integer[] arraIntegers = {};

        Collection collection = new Collection(arraIntegers);
        Iterator iterator = collection.collclass1();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            break;
        }
        //2 завдання
        System.out.println();
        System.out.println("2 Завдання");
        Integer[] arraIntegers1 = {};

        Collection collection1 = new Collection(arraIntegers1);
        Iterator iterator1 = collection1.collclass2();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            break;
        }

    }
}
