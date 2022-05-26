package com.spring.crud.reactivedemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Invoice {

    @Id
    private Integer id;
    private String name;
    private String number;
    private Double amount;
}
