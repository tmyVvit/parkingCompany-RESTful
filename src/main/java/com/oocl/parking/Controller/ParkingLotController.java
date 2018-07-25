package com.oocl.parking.Controller;


import com.oocl.parking.Model.ParkingLot;
import com.oocl.parking.Service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("")
    @ResponseBody
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot){
        return parkingLotService.addParkingLot(parkingLot);
    }

    @GetMapping("")
    public List<ParkingLot> getAllParkingLots(){
        return parkingLotService.getAllParkingLots();
    }
}
