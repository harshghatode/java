package com.wipro.java.designpattern.factory;


public class Helmet implements Accessory {
    @Override
    public void use() {
        System.out.println("Wearing a Helmet!");
    }
}