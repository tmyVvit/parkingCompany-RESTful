package com.oocl.parking.Service;

import com.oocl.parking.Model.ParkingBoy;
import com.oocl.parking.Model.ParkingLot;
import org.springframework.stereotype.Service;

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
}
