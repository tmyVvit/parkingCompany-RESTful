package com.oocl.parking.Service;


import com.oocl.parking.Model.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("parkingLotService")
public class ParkingLotService {
    private List<ParkingLot> parkingLots =new ArrayList<>();

    private boolean isIn(int plID){
        boolean isIn = false;
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.getPlID()==plID){
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public ParkingLot addParkingLot(ParkingLot parkingLot) {
        if(isIn(parkingLot.getPlID()))
            return null;
        parkingLots.add(parkingLot);
        return parkingLot;
    }

    public ParkingLot addParkingLotToParkingBoyById(int pbID, int plID) {
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.getPlID() == plID){
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
            if(parkingLot.getPlID() == plID){
                return parkingLot;
            }
        }
        return null;
    }

    public boolean isFull() {
        for(ParkingLot parkingLot: parkingLots){
            if(!parkingLot.isFull())
                return false;
        }
        return true;
    }

    public List<ParkingLot> getParkingLotByParkingBoyId(int pbID) {
        return parkingLots.stream().filter(u->u.getPbID()==pbID).collect(Collectors.toList());
    }

    public boolean deleteParkingLotById(int plID) {
        ParkingLot parkingLot = getParkingLotById(plID);
        if(parkingLot != null && parkingLot.isEmpty()){
            parkingLots.remove(parkingLot);
            return true;
        }
        return false;
    }

    public void deleteParkingBoy(int pbID) {
        parkingLots.stream().forEach(u->{
            if(u.getPbID()==pbID){
                u.setPbID(0);
            }
        });
    }
}
