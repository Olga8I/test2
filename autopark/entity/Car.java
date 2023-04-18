package com.outerspace.common.autopark.entity;

import com.outerspace.common.autopark.entity.enumerated.CargoType;
import com.outerspace.common.autopark.entity.enumerated.FuelType;

import java.time.Year;
import java.util.List;

public abstract class Car {
    protected String brand;
    protected String model;
    protected FuelType fuelType;
    protected int year;
    protected double consumption;






    // поля: максимальная грузоподъемность (по весу), максимальная грузоподъемность (по объему)
    // методы: получить текующую загрузу, получить максимальную грузоподъемность, принять заказ

    public Car(String brand, String model, FuelType fuelType, int year, double consumption) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
        this.consumption = consumption;
    }

    public void repair() {
        System.out.println("Repairing car");
    }

    public void fill() {
        System.out.println("Filling car");
    }

    public void wash() {
        System.out.println("Washing car");
    }

    /**
     * Checks if orders is suitable for this car, and if so, adds the order to the list of car's orders
     * @param order order to be added
     * @return true if order was accepted, false otherwise
     */
    public abstract boolean acceptOrder(Order order);
}
