package com.example.demospring.dao;

import com.example.demospring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakePersonDataAccessService implements PersonDao {
private static List<Person> DB = new ArrayList<>();

    @Override
    // cái này là thêm person cùng với id tự mình thêm vaò
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
    // trả hết thông tin người dùng

    @Override
    public int deletePersonById(UUID id) {
        return(0);
    }
    @Override
    public int updatePersonById(UUID id) {
        return(0);
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();  // tim thang user by id dung stream
    }
}
