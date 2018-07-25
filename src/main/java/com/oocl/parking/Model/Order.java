package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Order {
    private UUID orderID;
    private boolean status;

//    public Order(UUID _id){
//        orderID = _id;
//    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

}
