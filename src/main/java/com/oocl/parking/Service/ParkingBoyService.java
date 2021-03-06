package com.oocl.parking.Service;

import com.oocl.parking.Model.ParkingBoy;
import com.oocl.parking.Model.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("parkingBoyService")
public class ParkingBoyService {
    private List<ParkingBoy> parkingBoys =new ArrayList<>();

    @Autowired
    private ParkingLotService parkingLotService;

    private boolean isIn(int pbID){
        boolean isIn = false;
        for(ParkingBoy parkingBoy : parkingBoys){
            if(parkingBoy.getPbID()==pbID){
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public ParkingBoy addParkingBoys(ParkingBoy parkingBoy) {
        if(isIn(parkingBoy.getPbID()))
            return null;
        parkingBoys.add(parkingBoy);
        return parkingBoy;
    }

    public ParkingLot addParkingLotToParkingBoyById(int pbID, int plID) {
        return parkingLotService.addParkingLotToParkingBoyById(pbID, plID);
    }

    public List<ParkingBoy> getAllParkingBoys() {
        return parkingBoys;
    }

    public ParkingBoy getParkingBoyById(int pbID) {
        for(ParkingBoy parkingBoy: parkingBoys){
            if(parkingBoy.getPbID() == pbID){
                return parkingBoy;
            }
        }
        return null;
    }

    public boolean deleteParkingBoyByID(int pbID) {
        ParkingBoy parkingBoy = getParkingBoyById(pbID);
        if(parkingBoy != null){
            if(checkParkingBoyIsEmpty(pbID)){
                parkingBoys.remove(parkingBoy);
                parkingLotService.deleteParkingBoy(pbID);
                return true;
            }
        }
        return false;
    }

    private boolean checkParkingBoyIsEmpty(int pbID){
        List<ParkingLot> parkingLots = parkingLotService.getParkingLotByParkingBoyId(pbID);
        for(ParkingLot parkingLot : parkingLots){
            if(!parkingLot.isEmpty()){
                return false;
            }
        }
        return true;
    }
}
