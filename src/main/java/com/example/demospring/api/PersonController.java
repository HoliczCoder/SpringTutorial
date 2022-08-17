package com.example.demospring.api;

import com.example.demospring.model.Person;
import com.example.demospring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<Person> getAllPeople (){
        return personService.getAllPeople();
    }
}
