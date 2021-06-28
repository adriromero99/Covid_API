package com.covid.usa;

import com.covid.de.CountryDE;
import com.covid.de.StateDE;
import com.covid.usa.to.StateReportTO;
import com.covid.usa.to.StateResponseTO;
import com.covid.usa.to.UsaReportTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsaMapper {

    public static CountryDE TOtoDE(UsaReportTO usaReportTO){
        Set<StateDE> states = new HashSet<>();
        usaReportTO.getStatesReports().forEach(stateReportTO -> states.add(TOtoDE(stateReportTO, usaReportTO.getLastUpdatedAtSource())));

        return CountryDE.builder()
                .cases(usaReportTO.getTotalCases())
                .deaths(usaReportTO.getTotalDeaths())
                .date(usaReportTO.getLastUpdatedAtSource())
                .states(states)
                .build();
    }

    public static StateDE TOtoDE(StateReportTO stateReportTO, LocalDateTime date){
        return StateDE.builder()
                .cases(stateReportTO.getCasesReported())
                .name(stateReportTO.getName())
                .date(date)
                .build();
    }

    public static StateResponseTO DEtoTO(StateDE stateDE){
        return StateResponseTO.builder()
                .casesReported(stateDE.getCases())
                .name(stateDE.getName())
                .date(stateDE.getDate())
                .build();
    }

    public static List<StateResponseTO> DEtoTO(List<StateDE> stateDES){
        List<StateResponseTO> stateResponseTOS = new ArrayList<>();
        stateDES.forEach(stateDE -> stateResponseTOS.add(DEtoTO(stateDE)));
        return stateResponseTOS;
    }
}
