package com.covid.usa;

import com.covid.de.StateDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<StateDE, Long> {
    List<StateDE> findByName(String name);
}