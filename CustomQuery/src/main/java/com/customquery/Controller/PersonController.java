package com.customquery.Controller;

import com.customquery.domain.PassPort;
import com.customquery.domain.Person;
import com.customquery.repository.PersonRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository person;

    @RequestMapping(value = "/custom/{no}")
    public String giveDetails(@PathVariable("no") int id){
       return person.givePassPort(id);
    }

    /*@RequestMapping(value = "/custom")
    public List<Person> getAllPersons(){
        return person.getAll();
    }*/

}
