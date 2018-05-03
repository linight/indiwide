package me.indiwide.indiwide.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@RestController("person")
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("all")
    List<PersonOvo> all() {
        return service.all();
    }
}
