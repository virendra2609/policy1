package com.saksoft.policy.model;

import lombok.Getter;

import javax.persistence.*;


@Entity
@Table(name = "customer")
public class Customer {


    public Customer(){

    }
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private String custId;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private String dob;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "profession")
    private String profession;

    @Column(name = "annual_income")
    private int annualIncome;

    @Column(name = "policy_no")
    private int policyNo;

    @Column(name = "PAN")
    private String pan;

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public void setPolicyNo(int policyNo) {
        this.policyNo = policyNo;
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getProfession() {
        return profession;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public int getPolicyNo() {
        return policyNo;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
