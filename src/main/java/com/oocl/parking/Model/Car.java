package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int carID;

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }
}
