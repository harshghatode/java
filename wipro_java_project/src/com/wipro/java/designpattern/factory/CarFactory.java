package com.wipro.java.designpattern.factory;



public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Accessory createAccessory() {
        return new Helmet();
    }
}
