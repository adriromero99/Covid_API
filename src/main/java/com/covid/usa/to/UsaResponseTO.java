package com.covid.usa.to;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class UsaResponseTO {

    private Long totalCases;

    private Long totalDeaths;

    private Set<StateResponse> statesResponses;

    private LocalDateTime lastUpdatedAtSource;

}
