package com.outerspace.common.autopark.entity;

import com.outerspace.common.autopark.entity.enumerated.BodyType;
import com.outerspace.common.autopark.entity.enumerated.CargoType;
import com.outerspace.common.autopark.entity.enumerated.FuelType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bus> busList =new ArrayList<>();
        Bus buslist1 = new Bus("Volvo", "9700",FuelType.DIESEL, 2015, 20.0, 54);
        Bus buslist2 = new Bus("Scania", "Touring",FuelType.PETROL, 2010, 20,55);
        Bus buslist3 = new Bus("Hyundai", "Universe",FuelType.PETROL, 2020, 20.0,55);
        Bus buslist4 = new Bus("Hyundai", "Universe",FuelType.DIESEL, 2020, 20,53);

        List<Minibus> minibusList =new ArrayList<>();
        Minibus minibus = new Minibus("Mersedes", "Sprinter", FuelType.DIESEL, 2014, 20.0, 25, 1500, BodyType.TANK);
        Minibus minibus1 = new Minibus("Volkswagen", "Transporter", FuelType.PETROL, 2012, 20.0, 27, 1500, BodyType.TANK);
        Minibus minibus2 = new Minibus("Ford", "Transit", FuelType.DIESEL, 2013, 20.0, 35, 1500, BodyType.TANK);
        Minibus minibus3 = new Minibus("Fiat", "Ducato", FuelType.GASOLINE, 2015, 20.0, 0, 1500, BodyType.REFRIGERATOR);
        Minibus minibus4 = new Minibus("Mersedes", "Sprinter", FuelType.DIESEL, 2015, 20.0, 0, 1500, BodyType.TANK);

        List<Truck> truckList = new ArrayList<>();
        Truck truck = new Truck("VOLVO", "FE", FuelType.DIESEL, 2000, 20.0,25000, BodyType.TENT);
        Truck truck1 = new Truck("MAN", "TGL", FuelType.PETROL, 2000, 20.0,20000, BodyType.TANK);
        Truck truck2 = new Truck("IVECO", "Eurocargo", FuelType.DIESEL, 2000, 20.0,23000, BodyType.REFRIGERATOR);
        Truck truck3 = new Truck("Hyndai", "Porter", FuelType.PETROL, 2000, 20.0,23000, BodyType.TANK);
        Truck truck4 = new Truck("Mersedes", "Atego", FuelType.DIESEL, 2000, 20.0,20000, BodyType.TANK);

        List<Car> cars = new ArrayList<>();
        cars.addAll(busList);
        cars.addAll(minibusList);
        cars.addAll(truckList);
        // заполняем список

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(CargoType.FOOD, 15000, 3000,0,"Minsk", "Moscow");
        Order order2 = new Order(CargoType.LIQUID, 15000, 2000,0,"Minsk", "Brest");
        Order order3 = new Order(CargoType.PERISHABLE, 10000, 2000,0,"Minsk", "Vilnius");
        Order order4 = new Order(CargoType.NO_CARGO, 0, 1000,24,"Minsk", "Warsaw");
        Order order5 = new Order(CargoType.NO_CARGO, 0, 1000,56,"Minsk", "Smolensk");

        // заполняем список

        for (Order order : orders) {

            // найти каждому ордеру подходящую машину и отдать машине ордер
            // тут же можно и производить операции из последнего пункта
            for (Car car : cars) {
                if (car.acceptOrder(order)) {
                    break;
                }
            }
        }
    }
}
