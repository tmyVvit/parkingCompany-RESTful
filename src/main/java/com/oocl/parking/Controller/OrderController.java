package com.oocl.parking.Controller;

import com.oocl.parking.Model.Order;
import com.oocl.parking.Model.ParkingBoy;
import com.oocl.parking.Model.Receipt;
import com.oocl.parking.Service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("")
    @ResponseBody
    public boolean tryPark(@RequestBody Receipt receipt){
        return orderService.tryPark(receipt.getReceiptID());
    }

    @GetMapping("")
    @ResponseBody
    public List<Order> getOrdersByStatus(@RequestParam String status){
        return orderService.getOrdersByStatus(status);
    }

    @PatchMapping("/{receiptID}")
    @ResponseBody
    public Order parkingBoyPark(@PathVariable String receiptID, @RequestBody ParkingBoy parkingBoy){
        return orderService.parkingBoyPark(receiptID, parkingBoy.getPbID());
    }


}


