package main;

import entities.House;

public class HelloWorld{

    public static void main(String []args){
        House house = new House.Builder().hasCost(1).hasAddress("Washington").hasOwner("Barry O").build();
        System.out.println(house);
        System.out.println(house.address);
        System.out.println(house.cost);
        System.out.println(house.owner);
    }
}

