package com.outerspace.common.autopark.entity;

import com.outerspace.common.autopark.entity.enumerated.CargoType;

public class Order {

    private final CargoType cargoType;
    private final double cargoAmount;
    private final double cargoWeight;
    private final int passengers;
    private final String from;
    private final String to;

    public Order(CargoType cargoType, double cargoAmount, double cargoWeight, int passengers, String from, String to) {
        this.cargoType = cargoType;
        this.cargoAmount = cargoAmount;
        this.cargoWeight = cargoWeight;
        this.passengers = passengers;
        this.from = from;
        this.to = to;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public double getCargoAmount() {
        return cargoAmount;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
