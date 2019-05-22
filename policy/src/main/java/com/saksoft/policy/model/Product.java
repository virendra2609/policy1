package com.saksoft.policy.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "prod_id")
    private String prodId;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "prod_type")
    private String prodType;

    @Column(name = "premium")
    private int premium;
}
