package com.oocl.parking.Controller;


import com.oocl.parking.Model.ParkingBoy;
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
    public ParkingBoy addParkingBoys(@RequestBody ParkingBoy parkingBoy){
        return parkingBoyService.addParkingBoys(parkingBoy);
    }
}
