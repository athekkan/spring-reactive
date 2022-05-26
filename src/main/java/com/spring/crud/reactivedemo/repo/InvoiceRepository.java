package com.spring.crud.reactivedemo.repo;

import com.spring.crud.reactivedemo.model.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice,Integer> {
}
