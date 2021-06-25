package com.covid.usa.to;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StateReportTO {

    private String name;

    private String range;

    private Long casesReported;

}
