package com.oocl.parking.Controller;

import com.oocl.parking.Model.Order;
import com.oocl.parking.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{receiptID}")
    public boolean tryPark(@PathVariable String receiptID){
        return orderService.tryPark(receiptID);
    }

    @GetMapping("")
    public List<Order> getOrdersByStatus(@RequestParam String status){
        return orderService.getOrdersByStatus(status);
    }
}
