package com.outerspace.common.autopark.entity.enumerated;

import java.util.List;

import static com.outerspace.common.autopark.entity.enumerated.CargoType.*;
import static java.util.List.of;

public enum BodyType {
    TENT(of(FOOD)),
    REFRIGERATOR(of(FOOD, PERISHABLE)),
    TANK(of(LIQUID));

    private final List<CargoType> cargoTypes;

    BodyType(List<CargoType> cargoTypes) {
        this.cargoTypes = cargoTypes;
    }

    public List<CargoType> getCargoTypes() {
        return cargoTypes;
    }
}
