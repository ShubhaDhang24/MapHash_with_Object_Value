package org.example;

import java.util.HashMap;

public class Car {
    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    private int id;
    private String brand,model;


    public Car(String brand, String model) {
        getId();
        this.brand = brand;
        this.model = model;
    }
    /*public boolean print()
    {
        System.out.println("ID :"+getId()+"  BRAND :"+getBrand()+" MODEL :"+getModel());
        return false;
    }*/

    public static void main(String[] args) {
        HashMap<Integer,Car> newArray=new HashMap<>();
        newArray.put(1,new Car("TOYOTO","NEW-2023"));
        newArray.put(2,new Car("VOLVO","V60"));
        newArray.put(3,new Car("TOYOTO","YARIS-23"));

        Car car1= newArray.get(1);
        System.out.println("Car BRAND :"+car1.getBrand()+"  CAR MODEL "+car1.getModel());

    }

}