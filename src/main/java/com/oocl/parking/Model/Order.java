package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Order {
    private UUID orderID;
    private String status;
    private int plID;

    public Order(){
        status = "notParked";
    }

    public int getPlID() {
        return plID;
    }

    public void setPlID(int plID) {
        this.plID = plID;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderID() {
        return orderID.toString();
    }

    public void setOrderID(String orderIDString) {
        this.orderID = UUID.fromString(orderIDString);
    }

}
