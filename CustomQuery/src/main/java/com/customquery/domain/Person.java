package com.customquery.domain;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "Person_id")
    private int personId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Email_id")
    private String email;

    @OneToOne(mappedBy = "person")
    private PassPort passPort;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PassPort getPassPort() {
        return passPort;
    }

    public void setPassPort(PassPort passPort) {
        this.passPort = passPort;
    }
}
