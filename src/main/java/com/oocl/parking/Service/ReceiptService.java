package com.oocl.parking.Service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("receiptService")
public class ReceiptService {
    public String getReceiptId() {
        return UUID.randomUUID().toString();
    }
}
