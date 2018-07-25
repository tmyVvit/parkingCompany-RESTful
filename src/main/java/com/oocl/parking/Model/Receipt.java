package com.oocl.parking.Model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Receipt {
    private UUID receiptID;

    public Receipt(){
        receiptID = UUID.randomUUID();
    }

    public UUID getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(UUID receiptID) {
        this.receiptID = receiptID;
    }
}
