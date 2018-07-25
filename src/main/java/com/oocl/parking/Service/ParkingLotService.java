package com.oocl.parking.Service;


import com.oocl.parking.Model.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("parkingLotService")
public class ParkingLotService {
    private List<ParkingLot> parkingLots =new ArrayList<>();

    private boolean isIn(int plID){
        boolean isIn = false;
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.getplID()==plID){
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public ParkingLot addParkingLot(ParkingLot parkingLot) {
        if(isIn(parkingLot.getplID()))
            return null;
        parkingLots.add(parkingLot);
        return parkingLot;
    }

    public ParkingLot addParkingLotToParkingBoyById(int pbID, int plID) {
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.getplID() == plID){
                parkingLot.setPbID(pbID);
                return parkingLot;
            }
        }
        return null;
    }

    public List<ParkingLot> getAllParkingLots() {
        return parkingLots;
    }

    public ParkingLot getParkingLotById(int plID) {
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.getplID() == plID){
                return parkingLot;
            }
        }
        return null;
    }
}
