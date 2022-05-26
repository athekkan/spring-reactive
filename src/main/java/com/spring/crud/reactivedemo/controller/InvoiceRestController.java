package com.spring.crud.reactivedemo.controller;

import com.spring.crud.reactivedemo.model.Invoice;
import com.spring.crud.reactivedemo.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {

    @Autowired
    private IInvoiceService invoiceService;

    @GetMapping("/allInvoices")
    public Flux<Invoice> getAllInvoice(){
        return invoiceService.findAllInvoices();
    }

    @GetMapping("/test")
    public String testApi(){
        return "Hello World";
    }

    @PostMapping("/save")
    public Mono<Invoice> saveOneInvoice(@RequestBody Invoice invoice){
        return invoiceService.saveInvoice(invoice);
    }
}
