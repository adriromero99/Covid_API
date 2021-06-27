package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
public class UsaReportTO {

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

    @JsonProperty("casesByState")
    private Set<StateReportTO> statesReports;

    @ApiModelProperty(example = "https://covid.cdc.gov/covid-data-tracker/#cases_casesinlast7days", required = true)
    @Pattern(regexp="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    @Size(max = 100)
    @JsonProperty("sourceUrl")
    private String sourceUrl;

    @ApiModelProperty(example = "2021-06-27T00:00:00.000Z", required = true)
    @JsonProperty("lastUpdatedAtSource")
    private LocalDateTime lastUpdatedAtSource;

    @ApiModelProperty(example = "2021-06-27T00:00:00.000Z", required = true)
    @JsonProperty("lastUpdatedAtApify")
    private LocalDateTime lastUpdatedAtApify;

    @ApiModelProperty(example = "https://apify.com/petrpatek/covid-usa-cdc", required = true)
    @Pattern(regexp="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    @Size(max = 100)
    @JsonProperty("readMe")
    private String readMe;

}
