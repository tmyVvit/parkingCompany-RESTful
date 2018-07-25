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

    public ParkingBoy addParkingBoys(ParkingBoy parkingBoy) {
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
}
