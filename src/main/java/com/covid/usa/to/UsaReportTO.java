package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
public class UsaReportTO {

    private Long totalCases;

    private Long totalDeaths;

    @JsonProperty("casesByState")
    private Set<StateReportTO> statesReports;

    private String sourceUrl;

    private LocalDateTime lastUpdatedAtSource;

    private LocalDateTime lastUpdatedAtApify;

    private String readMe;

}
