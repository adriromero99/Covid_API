package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Builder
@Data
public class StateReportTO {

    @Pattern(regexp="^[a-zA-Z0-9 ]*$")
    @Size(max = 30)
    @JsonProperty(value = "name")
    private String name;

    @Pattern(regexp="^[a-zA-Z0-9 ]*$")
    @Size(max = 40)
    @JsonProperty(value = "range")
    private String range;

    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "casesReported")
    private Long casesReported;

}
