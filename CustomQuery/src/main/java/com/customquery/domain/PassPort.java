package com.customquery.domain;

import javax.persistence.*;

@Entity
@Table(name = "passport")
public class PassPort {

    @Id
    @Column(name = "Passport_id")
    private int passportId;

    @Column(name = "Passport_Number")
    private String passportNumber;

    @Column(name = "Fk_Person_id")
    private int personId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Person person;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
