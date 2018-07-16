package main;

import entities.TimeSheet;

public class HelloWorld{

    public static void main(String []args){
        TimeSheet timeSheet = new TimeSheet.Builder().hasCost(1).hasAddress("Washington").hasOwner("Barry O").build();
        System.out.println(timeSheet);
        System.out.println(timeSheet.address);
        System.out.println(timeSheet.cost);
        System.out.println(timeSheet.owner);
    }
}

