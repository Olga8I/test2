package com.outerspace.common.autopark.entity;

import com.outerspace.common.autopark.entity.enumerated.FuelType;

import java.time.Year;

public class Bus extends Car implements PassengerCar {

    private int passengers;

    public Bus(String brand, String model, FuelType fuelType, int year, double consumption, int passengers) {
        super(brand, model, fuelType, year, consumption);
        this.passengers = passengers;
    }

    @Override
    public void disinfectInterior() {
        System.out.println("Disinfecting interior of the bus");
    }

    @Override
    public boolean acceptOrder(Order order) {
        return false;
    }
}
