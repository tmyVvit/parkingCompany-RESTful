package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Order {
    private UUID orderID;

//    public Order(UUID _id){
//        orderID = _id;
//    }
    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

}
