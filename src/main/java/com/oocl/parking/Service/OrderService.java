package com.oocl.parking.Service;

import com.oocl.parking.Model.Order;
import com.oocl.parking.Model.ParkingLot;
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
        if(getOrderByID(receiptID)==null)
            return false;
        return true;
    }

    public List<Order> getOrdersByStatus(String status) {
        return orders.stream().filter(u->u.getStatus().equals(status)).collect(Collectors.toList());
    }

    public Order parkingBoyGetTheOrder(String receiptID, int pbID) {
        List<ParkingLot> parkingLots = parkingLotService.getParkingLotByParkingBoyId(pbID);
        Order order = getOrderByID(receiptID);
        for(ParkingLot parkingLot : parkingLots){
            if(!parkingLot.isFull()){
                order.setPlID(parkingLot.getPlID());
                order.setStatus("haveParked");
                parkingLot.park();
                return order;
            }
        }
        return null;

    }

    private Order getOrderByID(String receiptID) {
        for(Order order : orders){
            if(order.getOrderID().equals(receiptID)){
                return order;
            }
        }
        return null;
    }

    public Order pickUpTheCarUpdateTheOrder(String receiptID) {
        Order order = getOrderByID(receiptID);
        if(order != null && order.getStatus().equals("haveParked")){
            order.setStatus("havePickedUp");
            int plID = order.getPlID();
            ParkingLot parkingLot = parkingLotService.getParkingLotById(plID);
            parkingLot.unPark();
            return order;
        }
        return null;
    }
}
