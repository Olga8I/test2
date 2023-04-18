package com.outerspace.common.autopark.entity;

import com.outerspace.common.autopark.entity.enumerated.BodyType;
import com.outerspace.common.autopark.entity.enumerated.CargoType;
import com.outerspace.common.autopark.entity.enumerated.FuelType;

import java.time.Year;

public class Truck extends Car implements CargoCar {

    private double cargo;
    private BodyType bodyType;

    public Truck(String brand, String model, FuelType fuelType, int year, double consumption, double cargo, BodyType bodyType) {
        super(brand, model, fuelType, year, consumption);
        this.cargo = cargo;
        this.bodyType = bodyType;
    }

    @Override
    public void seal() {
        System.out.println("Sealing truck");
    }

    @Override
    public double getMaxCargoWeight() {

        return 0;
    }

    @Override
    public double getMaxCargoAmount() {
        return 0;
    }

    @Override
    public boolean acceptOrder(Order order) {
        boolean found = false;
        for (CargoType cargoType : bodyType.getCargoTypes()) {
            if (cargoType == order.getCargoType()) {
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }

        // ... other checks

        // add order to orderList
        // and return true
        return true;
    }
}


