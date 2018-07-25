package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {
    private int plID;
    private int size;
    private int pbID;
    private int parkedCars;

    public int getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(int parkedCars) {
        this.parkedCars = parkedCars;
    }


    public int getPlID() {
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

    public boolean isFull() {
        return size<=parkedCars;
    }
    private boolean isEmpty() {
        return parkedCars==0;
    }
    public void park() {
        if(!isFull())
            parkedCars++;
    }


    public void unPark() {
        if(!isEmpty())
            parkedCars--;
    }


}
