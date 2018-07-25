package com.oocl.parking.Service;

import com.oocl.parking.Model.ParkingBoy;
import com.oocl.parking.Model.ParkingLot;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@Service("parkingLotService")
public class ParkingLotService {
    private List<ParkingLot> parkingLots =new ArrayList<>();

    public ParkingLot addParkingLot(ParkingLot parkingLot) {
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
}
