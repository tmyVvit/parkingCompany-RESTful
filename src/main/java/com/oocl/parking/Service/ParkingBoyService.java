package com.oocl.parking.Service;

import com.oocl.parking.Model.ParkingBoy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("parkingBoyService")
public class ParkingBoyService {
    private List<ParkingBoy> parkingBoys =new ArrayList<>();

    public ParkingBoy addParkingBoys(ParkingBoy parkingBoy) {
//        ParkingBoy parkingBoy = new ParkingBoy();
//        parkingBoy.setPbID(pbID);
//        parkingBoy.setName(name);
        parkingBoys.add(parkingBoy);
        return parkingBoy;
    }
}
