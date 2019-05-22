package com.saksoft.policy.model;

import javax.persistence.*;

@Entity
@Table(name = "policy")
public class Policy {


    @Column(name = "policy_no")
    private int policyNo;

    @OneToOne(mappedBy = "custId")
    private String custId;

    @OneToOne
    @Column(name = "prod_id")
    private String prodId;
}
