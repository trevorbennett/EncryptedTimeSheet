package main;

public class HelloWorld{

    public static void main(String []args){
        Builder.hasCost(1).hasAddress("Washington").hasOwner("Barry O").build();
        System.out.println("Hello World");

    }
}

public class House{
    public int cost;
    public String address;
    public String owner;
}

public static class Builder{

    private House house;
    private int cost;
    private String address;
    private String owner;

    public Builder hasCost(int cost){
        this.cost = cost;
        return this;
    }

    public Builder hasAddress(String address){
        this.address = address;
        return this;
    }


    public Builder hasOwner(String owner){
        this.owner = owner;
        return this;
    }

    public House build(){
        house = new House();
        house.cost = this.cost;
        house.address = this.address;
        house.owner = this.owner;

        return house;
    }
}

