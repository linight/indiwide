package me.indiwide.indiwide.person;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
public interface PersonRepository extends JpaRepository<Person, String> {
}
