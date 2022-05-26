package com.spring.crud.reactivedemo.service;

import com.spring.crud.reactivedemo.model.Invoice;
import com.spring.crud.reactivedemo.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements IInvoiceService{
    @Autowired
    private InvoiceRepository repository;

    @Override
    public Mono<Invoice> saveInvoice(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public Flux<Invoice> findAllInvoices() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Invoice> getOneInvoice(Integer id) {
        return null;
    }

    @Override
    public Mono<Void> deleteInvoice(Integer id) {
        return null;
    }
}
