package com.customquery.repository;

import com.customquery.domain.PassPort;
import com.customquery.domain.Person;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepository {

    @Autowired
    private CrudOperation crud;

    public String givePassPort(int id){
        JSONObject jsonObject=new JSONObject();
         Object[] x=crud.givePassport(id);
         for(Object o:x){
             jsonObject.put("Passport_id",x);
         }
         return  jsonObject.toString();
    }

    /*public List<Person> getAll(){
        return crud.findAll();
    }*/
}
