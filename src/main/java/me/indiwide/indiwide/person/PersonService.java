package me.indiwide.indiwide.person;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonService {
    
    final PersonRepository repository;
    
    @Autowired
    PersonService(PersonRepository repository){
        this.repository = repository;
    }
    
    List<PersonOvo> all(){
        return repository.findAll().stream().map(p -> new PersonOvo().setLogin(p.getLogin())).collect(toList());
    }
}
