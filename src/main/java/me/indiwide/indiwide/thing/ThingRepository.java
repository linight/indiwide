package me.indiwide.indiwide.thing;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
public interface ThingRepository extends JpaRepository<Thing, String> {
}
