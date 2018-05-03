package me.indiwide.indiwide.thing;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import me.indiwide.indiwide.person.Person;

import javax.persistence.*;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Entity
@Data
@ToString(exclude = "author")
@EqualsAndHashCode(of = "id")
public class Thing {
    
    @GeneratedValue
    @Id
    String id;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Person author;
    
    String title;
}
