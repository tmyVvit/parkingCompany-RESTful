package com.oocl.parking.Service;

import com.oocl.parking.Model.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("orderService")
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    @Autowired
    private ParkingLotService parkingLotService;
    private ParkingBoyService parkingBoyService;

    public boolean tryPark(String receiptID) {
        if(parkingLotService.isFull()|| inOrders(receiptID)){
            return false;
        }
        Order order = new Order();
        order.setOrderID(receiptID);
        try{
            orders.add(order);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private boolean inOrders(String receiptID) {
        for(Order order: orders){
            if(order.getOrderID().equals(receiptID)){
                return true;
            }
        }
        return false;
    }

    public List<Order> getOrdersByStatus(String status) {
        return orders.stream().filter(u->u.getStatus().equals(status)).collect(Collectors.toList());
    }
}
