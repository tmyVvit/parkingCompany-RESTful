package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParkingBoy {
    private int pbID;
    private String name;

    private List<ParkingLot> parkingLots= new ArrayList<>();

//    public ParkingBoy(){
//        parkingLots = new ArrayList<>();
//    }

    public int getPbID() {
        return pbID;
    }

    public void setPbID(int pbID) {
        this.pbID = pbID;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
