package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class UsaResponseTO {

    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalCases")
    private Long totalCases;

    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalDeaths")
    private Long totalDeaths;

    @JsonProperty(value = "statesResponses")
    private Set<StateResponseTO> statesResponses;

    @JsonProperty(value = "lastUpdatedAtSource")
    private LocalDateTime lastUpdatedAtSource;

}
