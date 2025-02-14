package com.wipro.java.designpattern.factory;



public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }

    @Override
    public Accessory createAccessory() {
        return new GPS();
    }
}
