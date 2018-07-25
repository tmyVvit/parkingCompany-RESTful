package com.oocl.parking.Controller;

import com.oocl.parking.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @GetMapping("")
    public String getReceiptId(){
        return receiptService.getReceiptId();
    }
}
