package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("自定义普通汽车：");
        Car car = new Car("ade",160);

        System.out.println(car);
        System.out.println("自定义GPS汽车：");
        GPSCar gpsCar = new GPSCar("ade",60);
        System.out.println(gpsCar);
    }
}
