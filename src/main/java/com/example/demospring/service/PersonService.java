package com.example.demospring.service;

import com.example.demospring.dao.PersonDao;
import com.example.demospring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    @Qualifier(value = "fakePersonDataAccessService")
    PersonDao personDao;

    // chỗ này để đẩy phương thức từ interface vào trong method
    //     // cái này là thêm person cùng với id tự sinh
    public int addPerson(Person person) {
        // cái này hình như nó phải qua fakePerson
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople (){
        return personDao.selectAllPeople();
    };
}
//public class PersonService implements PersonDao {
//    @Override
//    public int insertPerson(UUID id, Person person) {
//        return 0;
//    }
//}
