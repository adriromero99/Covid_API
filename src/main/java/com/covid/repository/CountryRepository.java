package com.covid.repository;

import com.covid.de.CountryDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryDE, Long> {

}
