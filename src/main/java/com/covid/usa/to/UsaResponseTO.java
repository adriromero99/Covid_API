package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class UsaResponseTO {

    @ApiModelProperty(example = "114093", required = true)
    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalCases")
    private Long totalCases;

    @ApiModelProperty(example = "114093", required = true)
    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalDeaths")
    private Long totalDeaths;

    @JsonProperty(value = "statesResponses")
    private Set<StateResponseTO> statesResponses;

    @ApiModelProperty(example = "2021-06-27T00:00:00.000Z", required = true)
    @JsonProperty(value = "lastUpdatedAtSource")
    private LocalDateTime lastUpdatedAtSource;

}
