package com.covid.usa;

import com.covid.de.CountryDE;
import com.covid.de.StateDE;
import com.covid.usa.to.StateReportTO;
import com.covid.usa.to.UsaReportTO;

import java.util.HashSet;
import java.util.Set;

public class UsaMapper {

    public static CountryDE TOtoDE(UsaReportTO usaReportTO){
        Set<StateDE> states = new HashSet<>();
        usaReportTO.getStatesReports().forEach(stateReportTO -> states.add(TOtoDE(stateReportTO)));

        return CountryDE.builder()
                .cases(usaReportTO.getTotalCases())
                .deaths(usaReportTO.getTotalDeaths())
                .states(states)
                .build();
    }

    public static StateDE TOtoDE(StateReportTO stateReportTO){
        return StateDE.builder()
                .cases(stateReportTO.getCasesReported())
                .name(stateReportTO.getName())
                .build();
    }

}
