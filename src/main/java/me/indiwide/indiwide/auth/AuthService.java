package me.indiwide.indiwide.auth;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import me.indiwide.indiwide.person.Person;
import me.indiwide.indiwide.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthService {
    
    final PersonRepository personRepository;
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public AuthService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public RegisterOvo register(RegisterIvo ivo){
        var person = new Person();
        person.setLogin(ivo.getLogin()).setPassword(passwordEncoder.encode(ivo.getPassword()));
        personRepository.save(person);
        return new RegisterOvo().setMessage("OK");
    }
}
