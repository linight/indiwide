package me.indiwide.indiwide.person;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import me.indiwide.indiwide.thing.Thing;

import javax.persistence.*;
import java.util.List;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(exclude = "things")
@EqualsAndHashCode(of = "id")
@Accessors(chain = true)
public class Person {
    @Id 
    @GeneratedValue
    String id;
            
    String firstName;
    String lastName;
    String login;
    
    @Basic(fetch = FetchType.LAZY)
    String password;
    
    @OneToMany(mappedBy = "author")
    List<Thing> things;
}
