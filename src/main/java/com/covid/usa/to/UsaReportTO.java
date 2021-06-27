package com.covid.usa.to;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalCases")
    private Long totalCases;

    @Max(999999999)
    @Min(0)
    @JsonProperty(value = "totalDeaths")
    private Long totalDeaths;

    @JsonProperty("casesByState")
    private Set<StateReportTO> statesReports;

    @Pattern(regexp="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    @Size(max = 100)
    @JsonProperty("sourceUrl")
    private String sourceUrl;

    @JsonProperty("lastUpdatedAtSource")
    private LocalDateTime lastUpdatedAtSource;

    @JsonProperty("lastUpdatedAtApify")
    private LocalDateTime lastUpdatedAtApify;

    @Pattern(regexp="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    @Size(max = 100)
    @JsonProperty("readMe")
    private String readMe;

}
