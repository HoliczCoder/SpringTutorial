package com.example.demospring.api;

import com.example.demospring.model.Person;
import com.example.demospring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    // chỗ này dùng independecy injection
    @PostMapping
    public void addPerson (@RequestBody Person person){
        personService.addPerson(person);
    }
}
