package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {
    private int plID;
    private int size;
    private int pbID;
//    private Map<Order, Car> cars;

//    public ParkingLot(){
//        cars = new HashMap<>();
//    }
//    public Map<Order, Car> getCars() {
//    return cars;
//}
//
//    public void setCars(Map<Order, Car> cars) {
//        this.cars = cars;
//    }

    public int getplID() {
        return plID;
    }

    public void setPlID(int plID) {
        this.plID = plID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public int getPbID() {
        return pbID;
    }

    public void setPbID(int pbID) {
        this.pbID = pbID;
    }

}
