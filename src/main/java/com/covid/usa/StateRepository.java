package com.covid.usa;

import com.covid.de.StateDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<StateDE, Long> {
    StateDE findByName(String name);
}