package com.customquery.repository;

import com.customquery.domain.PassPort;
import com.customquery.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CrudOperation extends JpaRepository<Person,Integer> {
    @Query(value = "select Passport_id,Passport_Number,Fk_Person_id from passport where Fk_Person_id= ?1",nativeQuery = true)
    public Object[] givePassport(int id);
}
