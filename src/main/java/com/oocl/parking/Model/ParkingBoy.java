package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParkingBoy {
    private int pbID;
    private String name;
    //private int numberOfParkingLots;

   // private List<ParkingLot> parkingLots;

//    public ParkingBoy(){
//        parkingLots = new ArrayList<>();
//    }

//    public List<ParkingLot> getParkingLots() {
//        return parkingLots;
//    }
//
//    public void setParkingLots(List<ParkingLot> parkingLots) {
//        this.parkingLots = parkingLots;
//    }
//public int getNumberOfParkingLots() {
//    return numberOfParkingLots;
//}
//
//    public void setNumberOfParkingLots(int numberOfParkingLots) {
//        this.numberOfParkingLots = numberOfParkingLots;
//    }
//
//    public void addParkingLot(){
//        this.numberOfParkingLots++;
//    }
//
//    public void subParkingLot(){
//        this.numberOfParkingLots--;
//    }


    public int getPbID() {
        return pbID;
    }

    public void setPbID(int pbID) {
        this.pbID = pbID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
