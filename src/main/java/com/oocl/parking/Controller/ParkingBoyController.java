package com.oocl.parking.Controller;


import com.oocl.parking.Model.ParkingBoy;
import com.oocl.parking.Model.ParkingLot;
import com.oocl.parking.Service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyService parkingBoyService;

    @PostMapping(path="")
    @ResponseBody
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        return parkingBoyService.addParkingBoys(parkingBoy);
    }

    @PostMapping(path="/{pbID}/parkingLots")
    @ResponseBody
    public ParkingLot addParkingLotToParkingBoyById(@PathVariable int pbID, @RequestBody ParkingLot parkingLot){
        return parkingBoyService.addParkingLotToParkingBoyById(pbID, parkingLot.getPlID());
    }

}
