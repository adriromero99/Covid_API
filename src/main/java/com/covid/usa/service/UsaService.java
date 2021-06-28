package com.covid.usa.service;

import com.covid.repository.CountryRepository;
import com.covid.usa.StateRepository;
import com.covid.usa.UsaMapper;
import com.covid.usa.to.StateResponseTO;
import com.covid.usa.to.UsaReportTO;
import com.covid.usa.to.UsaResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsaService {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    StateRepository stateRepository;

    public StateResponseTO getStateByName(String state){
        return UsaMapper.DEtoTO(stateRepository.findByName(state));
    }

    public void save(UsaReportTO reportTO){
        countryRepository.save(UsaMapper.TOtoDE(reportTO));
    }

}
