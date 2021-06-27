package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Builder
@Data
public class StateReportTO {

    @ApiModelProperty(example = "Virginia", required = true)
    @Pattern(regexp="^[a-zA-Z0-9 ]*$")
    @Size(max = 30)
    @JsonProperty(value = "name")
    private String name;

    @ApiModelProperty(example = "40,001 or more", required = true)
    @Pattern(regexp="^[a-zA-Z0-9 ]*$")
    @Size(max = 40)
    @JsonProperty(value = "range")
    private String range;

    @ApiModelProperty(example = "114093", required = true)
    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "casesReported")
    private Long casesReported;

}
