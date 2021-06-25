package com.covid.usa.service;

import com.covid.repository.CountryRepository;
import com.covid.usa.UsaMapper;
import com.covid.usa.to.UsaReportTO;
import com.covid.usa.to.UsaResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsaService {

    @Autowired
    CountryRepository countryRepository;

    public UsaResponseTO getUsaData(){
        return UsaResponseTO.builder().build();
    }

    public void save(UsaReportTO reportTO){
        countryRepository.save(UsaMapper.TOtoDE(reportTO));
    }

}
