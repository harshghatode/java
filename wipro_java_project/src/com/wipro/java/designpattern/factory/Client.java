package com.wipro.java.designpattern.factory;



public class Client {
    public static void main(String[] args) {
        // Create a Car and its Accessory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        Accessory helmet = carFactory.createAccessory();

        car.drive();
        helmet.use();

        // Create a Bike and its Accessory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        Accessory gps = bikeFactory.createAccessory();

        bike.drive();
        gps.use();
    }
}